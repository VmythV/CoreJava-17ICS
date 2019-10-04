package codes_AOJ;

import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_J {

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);


    public static void main(String[] args) {
        init();
        //  for (int i = 0; i < N; i++) System.out.println(Arrays.toString(G[i]));
        int n = cin.nextInt();
        int m = cin.nextInt();
        System.out.println(G[n][m]);
        cin.close();
        cout.close();
    }

    static final int INF = 999;
    static int N = 100;
    static int G[][] = new int[N][N];

    static void init() {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++) {
                G[i][j] = INF;
                if (i == j) G[i][j] = Math.min(G[i][j], 0);
                if (j == i * 3 || i / 2 == j) G[i][j] = Math.min(G[i][j], 1);
            }
        for (int k = 1; k < N; k++)//floyed
            for (int i = 1; i < N; i++)
                for (int j = 1; j < N; j++)
                    if (G[i][k] + G[k][j] < G[i][j])
                        G[i][j] = G[i][k] + G[k][j];
    }
}
