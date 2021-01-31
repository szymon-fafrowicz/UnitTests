package pl.coderslab.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxesOperationTest {
    private final double DELTA = 0.001;

    @Test
    public void calculateVatOfPositiveValues() {
        double expected = 23d;
        double actual = TaxesOperation.calculateVat(100d, 23);

        assertEquals(expected, actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateVatOfNegativeVat() {
        double actual = TaxesOperation.calculateVat(100d, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateVatOfNegativePrice() {
        double actual = TaxesOperation.calculateVat(-5d, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateVatOfNegativeValues() {
        double actual = TaxesOperation.calculateVat(-5d, -5);
    }

    @Test
    public void calculateVatOfVatZero() {
        double expected = 0d;
        double actual = TaxesOperation.calculateVat(100d, 0);

        assertEquals(expected, actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculateVatOfPrizeZero() {
        double actual = TaxesOperation.calculateVat(0d, 23);
    }
}