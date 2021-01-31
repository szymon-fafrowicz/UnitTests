package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorsTest {

    @Test
    public void generatePrimeFactors2() {
        final int[] expected = {1,2};
        final int[] actual = Factors.generatePrimeFactors(2);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors6() {
        final int[] expected = {1,2,3,6};
        final int[] actual = Factors.generatePrimeFactors(6);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors9() {
        final int[] expected = {1,3,9};
        final int[] actual = Factors.generatePrimeFactors(9);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors12() {
        final int[] expected = {1,2,3,4,6,12};
        final int[] actual = Factors.generatePrimeFactors(12);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors13() {
        final int[] expected = {1,13};
        final int[] actual = Factors.generatePrimeFactors(13);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void generatePrimeFactors100() {
        final int[] expected = {1,2,4,5,10,20,25,50,100};
        final int[] actual = Factors.generatePrimeFactors(100);

        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void generatePrimeFactors0() {
        Factors.generatePrimeFactors(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void generatePrimeFactorsNegativeNumber() {
        Factors.generatePrimeFactors(-5);
    }

}