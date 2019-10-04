package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_C {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            double x1 = cin.nextDouble();
            double y1 = cin.nextDouble();
            double x2 = cin.nextDouble();
            double y2 = cin.nextDouble();
            cout.println(String.format("%.2f", Math.hypot(x1 - x2, y1 - y2)));
        }
        cin.close();
        cout.close();
    }
}
