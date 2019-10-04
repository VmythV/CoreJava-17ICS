package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_E {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int T = cin.nextInt();
        while (T-- > 0) {
            double r = cin.nextDouble();
            cout.println(String.format("%.6f", Math.PI * r * r));
        }
        cin.close();
        cout.close();
    }
}
