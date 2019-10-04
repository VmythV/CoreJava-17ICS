package codes_my;

import java.util.Scanner;

public class Problem_F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int s = 0, a = 0, b = 0;
            for (int i = 1; i <= n; i++) {
                a++;
                b = b + 2;
                s = s + b;
                if (i == n) {
                    s = s / a;
                    System.out.println(s);
                } else if (a == m) {
                    s = s / m;
                    System.out.print(s + " ");
                    a = 0;
                    s = 0;
                }
            }
        }
        cin.close();
    }
}
