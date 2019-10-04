package codes_my;

import java.util.Scanner;

public class Problem_G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n, m;
            n = cin.nextInt();
            m = cin.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            int x;
            if (n > m) {
                x = n;
                n = m;
                m = x;
            }
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    sum1 = sum1 + i * i;
                } else {
                    sum2 = sum2 + i * i * i;
                }
            }
            System.out.printf("%d ", sum1);
            System.out.println(sum2);
        }
        cin.close();
    }

}

