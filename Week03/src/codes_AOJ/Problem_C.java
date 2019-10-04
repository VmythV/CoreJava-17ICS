package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_C {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int n = cin.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) s += 1.0 / i;
        cout.printf("%.6f", s);
        cin.close();
        cout.close();
    }
}