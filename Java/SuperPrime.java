import java.util.ArrayList;
import java.util.List;

import exception.BadRequestException;

public class SuperPrime {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    private static boolean isSuperPrime(int n) {
        if (n < 10)
            return isPrime(n);

        return isPrime(n) && isSuperPrime(n / 10);
    }

    public static List<Integer> superPrimes(String str) {

        try {
            if (str == null) {
                throw new IllegalArgumentException("Number cannot be null");
            }

            int n = Integer.parseInt(str);

            if (n > 1000) {
                throw new BadRequestException("n should be less than equal to 1000");
            }

            List<Integer> li = new ArrayList<>();
            for (int i = 2; i <= n; i++) {
                if (isSuperPrime(i)) {
                    li.add(i);
                }
            }
            return li;

        } catch (BadRequestException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        return null;

    }

    public static void main(String[] args) {
        System.out.println(superPrimes("100"));
        System.out.println(superPrimes("500"));
        System.out.println(superPrimes("1000"));
        System.out.println(superPrimes("10000"));

    }
}
