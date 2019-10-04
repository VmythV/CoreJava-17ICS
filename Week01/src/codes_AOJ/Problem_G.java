package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_G {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int left = cin.nextInt();
            int right = cin.nextInt();
            int square = 0, cube = 0;
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    square += i * i;
                } else {
                    cube += i * i * i;
                }
            }
            cout.println(square + " " + cube);
        }
        cin.close();
        cout.close();
    }
}