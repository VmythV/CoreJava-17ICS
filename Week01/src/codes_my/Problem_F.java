package codes_my;

import java.util.Scanner;

public class Problem_F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int A = cin.nextInt();
            int B = cin.nextInt();
            System.out.println((A % 100 + B % 100) % 100);
        }
        cin.close();
    }
}

