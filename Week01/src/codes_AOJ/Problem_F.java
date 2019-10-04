package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_F {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int T = cin.nextInt();
        while (T-- > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            cout.println((a + b) % 100);
        }
        cin.close();
        cout.close();
    }
}