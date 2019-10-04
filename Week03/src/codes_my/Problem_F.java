package codes_my;

import java.util.Scanner;

public class Problem_F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n-- != 0) {
            int h1, m1, s1, h2, m2, s2;

            h1 = scanner.nextInt();
            m1 = scanner.nextInt();
            s1 = scanner.nextInt();
            h2 = scanner.nextInt();
            m2 = scanner.nextInt();
            s2 = scanner.nextInt();

            m1 += (s1 + s2) / 60;
            s1 = (s1 + s2) % 60;

            h1 += (m1 + m2) / 60;
            m1 = (m1 + m2) % 60;

            h1 += h2;

            System.out.println(h1 + " " + m1 + " " + s1);
        }
    }
}
