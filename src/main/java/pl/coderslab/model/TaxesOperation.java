package pl.coderslab.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxesOperation {

    public static double calculateVat(Double price, int vat) {
        if (price <= 0 || vat < 0) {
            throw new IllegalArgumentException("Entered incorrect data.");
        }
        if (vat == 0) {
            return 0d;
        }

        double amount = price * ((double) vat / 100);
        return new BigDecimal(amount).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
