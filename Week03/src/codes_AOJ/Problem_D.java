package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_D {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int F[] = new int[10];
        F[0] = F[1] = 1;
        for (int i = 2; i < F.length; i++) F[i] = F[i - 1] * i;
        for (int i = 1; i <= 10000000; i++) {
            int j = i, s = 0;
            while (j > 0) {
                s += F[j % 10];
                j /= 10;
            }
            if (s == i)
                cout.println(i);
        }
        cin.close();
        cout.close();
    }
}
