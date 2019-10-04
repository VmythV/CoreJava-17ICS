package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_B {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                cout.println(String.format("%d/2=%d", n, n = n / 2));
            } else {
                cout.println(String.format("%d*3+1=%d", n, n = 3 * n + 1));
            }
        }
        cin.close();
        cout.close();
    }
}
