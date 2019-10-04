package codes_my;

import java.util.Scanner;

public class Problem_J {
    static int rev(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s = s * 10 + d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int A = cin.nextInt();
            int B = cin.nextInt();
            System.out.println(rev(rev(A) * rev(B)));
        }
        cin.close();
    }
}
