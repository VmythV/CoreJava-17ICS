package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_F {
    static Scanner cin=new Scanner(System.in);
    static PrintWriter cout=new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = cin.nextInt();
        while (N-- > 0) {
            int ah = cin.nextInt();
            int am = cin.nextInt();
            int as = cin.nextInt();
            int bh = cin.nextInt();
            int bm = cin.nextInt();
            int bs = cin.nextInt();
            int carry = 0;
            int cs = (as + bs + carry);
            carry = cs / 60;
            cs %= 60;
            int cm = (am + bm + carry);
            carry = cm / 60;
            cm %= 60;
            int ch = (ah + bh + carry);
            cout.println(String.format("%d %d %d", ch, cm, cs));
        }
        cin.close();
        cout.close();
    }
}
