package codes_my;

public class Problem_B {
    public static void main(String[] args) {
        int[] num = new int[100000];
        for (int i = 0; i < num.length; i++) {
            num[i] = 1;
        }
        int i, j = 0, rem = 0, l = 0;
        for (i = 1; i <= 1977; i++) {
            for (j = 0; j <= l; j++) {
                num[j] = num[j] * i + rem;
                rem = num[j] / 10000;
                num[j] = num[j] % 10000;
            }
            if (rem != 0) {
                l++;
                num[j] = rem;
                rem = 0;
            }
            j = l;
        }
        System.out.printf("%d", num[j--]);
        for (; j >= 0; j--) {
            System.out.printf("%04d", num[j]);
        }
        System.out.println();
    }
}

