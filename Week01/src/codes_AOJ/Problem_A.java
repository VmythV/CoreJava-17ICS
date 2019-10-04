package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_A {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        double a = cin.nextDouble();
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        double delta = Math.sqrt(b * b - 4 * a * c);
        double roots[] = new double[]{(-b + delta) / (2 * a), (-b - delta) / (2 * a)};
        if (roots[0] < roots[1]) {
            double temp = roots[0];
            roots[0] = roots[1];
            roots[1] = temp;
        }
        cout.println(String.format("%.2f %.2f", roots[0], roots[1]));

        cin.close();
        cout.close();
    }
}
