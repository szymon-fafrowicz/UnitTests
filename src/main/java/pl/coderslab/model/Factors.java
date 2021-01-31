package pl.coderslab.model;


import java.util.ArrayList;
import java.util.List;

public class Factors {

    public static int[] generatePrimeFactors(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Entered number must be greater than 0.");
        }

        List<Integer> factors = new ArrayList<>();
        factors.add(1);

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        factors.add(n);

        return factors.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
