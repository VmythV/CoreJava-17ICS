package codes_my;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        int n = 1977;
        BigInteger s = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            s = s.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(s);

    }

    static Scanner cin = new Scanner(System.in);
}
