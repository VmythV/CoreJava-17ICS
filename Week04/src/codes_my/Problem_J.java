package codes_my;

import java.util.Scanner;

public class Problem_J {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int N = cin.nextInt();
            if(N==0){
                break;
            }
            else if(N==1){
                int[][] magic = new int[N][N];
                magic[0][0] = 1;
                System.out.println(magic[0][0]);
                System.out.println();
            }else{
                int[][] magic = new int[N][N];
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++)
                        magic[i][j] = 0;
                }
                int x = 0, y = N / 2;
                magic[x][y] = 1;
                for (int i = 2; i <= N * N; i++) { // 待填数字i
                    if (x == 0 && y == N-1)
                        x = 1; // 右上方格子要特殊处理
                    else {
                        x--;
                        y++; // 将数字i填在右上方
                        if (x < 0)
                            x = N-1; // 越界判断
                        if (y > N-1)
                            y = 0; // 越界判断
                        if (magic[x][y] > 0) {
                            x += 2;
                            y--;
                        } // 填在上一个数的正下方
                    }
                    magic[x][y] = i;
                }
                for (int i = magic[0].length-1; i >=0; i--) {
                    for (int j = 0; j < magic[0].length; j++) {
                        System.out.print(magic[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
        cin.close();
    }
}

