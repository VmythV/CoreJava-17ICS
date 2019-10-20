package codes_my;

import java.util.Scanner;

public class Problem_E {
    private static final int MOD = 1000000;

    public static void main(String[] args) {
        int n = cin.nextInt();
        if (n > 25) n = 25;
        long[] a = new long[n + 1];//0!~n!
        a[1] = 1;
        for (int i = 2; i <= n; i++) a[i] = (a[i - 1] * i) % MOD;
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s = (s + a[i]) % MOD;
        }
        System.out.println(s);

    }

    static Scanner cin = new Scanner(System.in);
}
