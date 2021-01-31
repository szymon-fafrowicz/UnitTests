package pl.coderslab.example1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest {
    @Test
    public void firstTest() {
        //given
        final int a = 2;
        final int b = 3;
        //when
        int sum = a + b;
        //then
        assertEquals(5, sum);
    }

    @Test
    public void secondTest() {
        assertEquals(4, 2 + 2);
    }

}
