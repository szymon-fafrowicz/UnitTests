package pl.coderslab.repository;

import org.junit.Test;
import pl.coderslab.model.User;

import static org.junit.Assert.*;

public class UserRepositoryTest {
    UserRepository ur = new UserRepository();

    @Test
    public void create() {
        User u = new User().setName("Ala");
        ur.create(u);

        assertEquals(1l, u.getId());
        assertEquals(1l, ur.count());
        User user = ur.readById(1l);
        assertEquals(user, u);
    }

    @Test
    public void delete() {
        User u = new User().setName("Ala");
        ur.create(u);

        assertEquals(1l, u.getId());
        ur.delete(u);

        assertEquals(0l, u.getId());
        assertEquals(0l, ur.count());
    }

    @Test
    public void update(){
        // given
        UserRepository ur = new UserRepository();
        User u = new User().setName("Ala");

        ur.create(u);

        // when
        u.setName("ola");
        ur.update(u);

        // then
        assertEquals("ola", u.getName());
        assertEquals(1L, ur.count());
        assertEquals(1L, u.getId());
        User user = ur.readById(1L);
        assertEquals(user, u);


    }



}