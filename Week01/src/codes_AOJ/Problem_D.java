package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_D {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            double r = cin.nextDouble();
            cout.println(String.format("%.3f", 4 * Math.PI * Math.pow(r, 3) / 3));
        }
        cin.close();
        cout.close();
    }
}
