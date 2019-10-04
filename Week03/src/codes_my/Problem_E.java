package codes_my;

import java.util.Scanner;

public class Problem_E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = 0;
        int N = cin.nextInt();
        if (N==10||N == 20 || N == 50 || N == 100) {
            for (int i = 1; i < 20; i++) {
                for (int j = 1; j < 50; j++) {
                    for (int k = 1; k < 97; k++)
                        if (i * 5 + j * 2 + k == N)
                            t++;
                }
            }
            System.out.println(t);
        }
        cin.close();
    }
}