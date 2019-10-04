package codes_AOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_H {
    static int N = 1000000;
    static boolean prime[] = new boolean[N + 1];

    static void fill() {
        Arrays.fill(prime, true);
        int c;
        for (int j = 1; j <= N; j++) {
            int a = j;
            while (a != 0) {
                c = a % 10;
                a = a / 10;
                if (c == 0)
                    prime[j] = false;

            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        fill();
        while (cin.hasNext()) {
            int c = 0;
            int a = cin.nextInt();
            if (prime[a] == false)
                System.out.println("Unlucky");
            else {
                for (int i = 1; i <= a; i++)
                    if (prime[i] == true)
                        c++;
                System.out.println(c);
            }
        }
        cin.close();
    }
}