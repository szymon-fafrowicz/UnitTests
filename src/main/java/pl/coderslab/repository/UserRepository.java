package pl.coderslab.repository;

import pl.coderslab.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final static long UNASSIGNED_ID = 0l;
    private long NEXT_ID = 1l;
    private List<User> users = new ArrayList<>();

    public void create(User u) {
        u.setId(NEXT_ID++);
        User userToInsert = new User(u);
        users.add(userToInsert);
    }

    public long count() {
        return this.users.size();
    }

    public User readById(long id) {
        Optional<User> found = this.users.stream()
                .filter(u -> u.getId() == id).findAny();

        User result = null;

        if (found.isPresent()) {
            result = new User(found.get());
        }

        return result;
    }

    public void delete(User user) {
        Optional<User> found = this.users.stream()
                .filter(u -> u.getId() == user.getId()).findAny();

        if (!found.isPresent()) {
            throw new RuntimeException("User not found");
        }

        this.users.remove(found.get());
        user.setId(UNASSIGNED_ID);
    }

    public void update(User user) {
        Optional<User> found = this.users.stream()
                .filter(u -> u.getId() == user.getId())
                .findAny();

        if (!found.isPresent()){
            throw new RuntimeException("User not found");
        }

        User toUpdate = found.get();
        toUpdate.setName(user.getName());
    }
}
