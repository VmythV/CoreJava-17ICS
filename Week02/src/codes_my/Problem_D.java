package codes_my;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                S += i;
            }
        }
        System.out.println(S);
        cin.close();
    }
}

