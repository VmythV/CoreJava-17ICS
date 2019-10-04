package codes_my;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double x1 = cin.nextDouble();
            double y1 = cin.nextDouble();
            double x2 = cin.nextDouble();
            double y2 = cin.nextDouble();
            double s = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            System.out.printf("%.2f\n", s);
        }
        cin.close();
    }
}

