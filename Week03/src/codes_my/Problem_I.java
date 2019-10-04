package codes_my;

import java.util.Scanner;

public class Problem_I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int max = 0;
            System.out.print(a + " " + b);
            for (int i=a; i <= b; i++) {
                int test=i;
                int flag = 1;
                if (test == 1)
                    continue;
                while (test != 1) {
                    if (test % 2 == 1) {
                        test = 3 * test + 1;
                        flag++;
                    } else {
                        test = test / 2;
                        flag++;
                    }
                    if (flag > max)
                        max = flag;
                }
            }
            System.out.println(" " + max);
        }
    }
}

