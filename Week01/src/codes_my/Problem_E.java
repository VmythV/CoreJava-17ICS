package codes_my;

import java.util.Scanner;

public class Problem_E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            Double r = cin.nextDouble();
            System.out.printf("%.6f\n", Math.PI * r * r);
        }
        cin.close();
    }
}

