package pl.coderslab.model;


import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private final double DELTA = 0.001;

    @Test
    public void circleAreaofRadius4() {
        double expected = 50.27;
        double actual = Circle.circleArea(4);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void circleAreaofRadius6() {
        double expected = 113.10;
        double actual = Circle.circleArea(6);

        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void circleAreaofRadius1() {
        double expected = 3.14;
        double actual = Circle.circleArea(1);

        assertEquals(expected, actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleAreaofRadius0() {
        double actual = Circle.circleArea(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleAreaofRadiuseNegative() {
        double actual = Circle.circleArea(-5);
    }
}