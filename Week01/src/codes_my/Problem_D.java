package codes_my;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double r = cin.nextDouble();
            System.out.printf("%.3f\n", (4.0 / 3) * Math.PI * r * r * r);
        }
        cin.close();
    }
}

