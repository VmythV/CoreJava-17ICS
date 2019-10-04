package codes_my;

import java.util.Scanner;

public class Problem_I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i] += place(j, i);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        cin.close();
    }
    public static int place(int m, int n) {// m = 传入的数 n= 出现的数
        int result = 0;
        if (m == 0)
            return 0;
        while (m > 0) {
            int temp = m % 10;
            if (temp == n) {
                result++;
            }
            m /= 10;
        }
        return result;
    }

}

