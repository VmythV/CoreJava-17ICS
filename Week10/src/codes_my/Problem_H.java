package codes_my;

import java.util.*;

public class Problem_H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            StringBuilder sb = new StringBuilder("");
            int a[] = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                a[i] = cin.nextInt();
            }
            for (int i = 0; i < n + 1; i++) {
                if (a[i] != 0) {
                    if (0 == (n - i)) {
                        if (a[i] > 0) {
                            sb.append(String.format("+%d", a[i] * 1));
                        } else {
                            sb.append(String.format("%d", a[i] * 1));
                        }
                    } else if ((n - i) == 1) {
                        if (a[i] == 1) {
                            sb.append("+x");
                        } else if (a[i] == -1) {
                            sb.append("-x");
                        } else if (a[i] >= 0) {
                            sb.append(String.format("+%dx", a[i]));
                        } else {
                            sb.append(String.format("%dx", a[i]));
                        }
                    } else {
                        if (a[i] == 1) {
                            sb.append(String.format("+x^%d", n - i));
                        } else if (a[i] == -1) {
                            sb.append(String.format("-x^%d", n - i));
                        } else if (a[i] >= 0) {
                            sb.append(String.format("+%dx^%d", a[i], n - i));
                        } else {
                            sb.append(String.format("%dx^%d", a[i], n - i));
                        }
                    }
                }
            }
            String prefix = sb.substring(0, 1);
            if (prefix.equals("+")) {
                System.out.println(sb.substring(1, sb.length()));
            } else {
                System.out.println(sb.toString());
            }
        }
        cin.close();
    }
}
