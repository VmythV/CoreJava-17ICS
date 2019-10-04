package codes_my;

import java.util.Scanner;

public class Problem_E {
    static int ans;
    static void Shift(int row, int n, int matrix[][]) {
        int temp = matrix[row][n - 1];
        for (int i = n - 1; i > 0; i--) {
            matrix[row][i] = matrix[row][i - 1];
        }
        matrix[row][0] = temp;
    }

    static void DFS(int index, int n, int matrix[][]) {
        if (index == n) {
            return;
        }
        int maxim = -100000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[j][i];
            }
            if (sum > maxim) {
                maxim = sum;
            }
        }
        if (maxim < ans) {
            ans = maxim;
        }
        for (int i = 0; i < n; i++) {
            Shift(index, n, matrix);
            DFS(index + 1, n, matrix);
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            if(n==-1) break;
            int[][] matrix = new int[10][10];
            ans = 0x7fffffff;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = cin.nextInt();
                }
            }
            DFS(0, n, matrix);
            System.out.printf("%d\n", ans);
            //return;
        }
    }
}

