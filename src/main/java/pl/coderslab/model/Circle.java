package pl.coderslab.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
    public static double circleArea(int radius) {
        if (radius < 1) {
            throw new IllegalArgumentException("Radius must be greater 0.");
        }

        double area = Math.PI * radius * radius;
        return new BigDecimal(area).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}



