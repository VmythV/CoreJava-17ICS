package codes_my;

public class Problem_B {
    public static void main(String[] args) {
        for (int x = 1;; x += 8) {
            if (x % 8 != 1)
                continue;
            if (x / 8 % 8 != 1)
                continue;
            if (x / 8 / 8 % 8 != 7)
                continue;
            int a = x / 8 / 8 / 8;
            if (x % 17 != 4)
                continue;
            if (x / 17 % 17 != 15)
                continue;
            int b = x / 17 / 17;
            if (b != 2 * a)
                continue;
            System.out.println(x);
            break;
        }
    }
}
