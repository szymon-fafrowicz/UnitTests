package pl.coderslab.maxValue;


import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {
    @Test
    public void shouldFindMaxValue() {
        int[] list = {-5, 0, 10, 17};
        int actual = MaxValue.largest(list);

        assertEquals(17, actual);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExeptionWhenArrayLengthZero() {
        int[] list = new int[0];
        MaxValue.largest(list);
    }


}