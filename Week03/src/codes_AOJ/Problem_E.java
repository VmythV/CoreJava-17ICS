package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_E {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        int m = cin.nextInt();
        int cnt = 0;
        for (int one = 1; one < m; one++)
            for (int two = 1; two * 2 + one < m; ++two) {
                if ((m - one - two * 2) % 5 == 0)
                    ++cnt;
            }
        cout.println(cnt);
        cin.close();
        cout.close();
    }
}
