package codes_my;

import java.util.Scanner;

public class Problem_K {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            if(n==1){
                System.out.println("1");
                System.out.println();
            }else if(n==2){
                System.out.println("1");
                System.out.println("1"+" "+"1");
                System.out.println();
            }else{
                int[][] triangle = new int[n][n];
                for (int i = 0; i < triangle[0].length; i++) {
                    triangle[i][0] = 1;
                    triangle[i][i] = 1;
                }
                for (int i = 2; i < triangle[0].length; i++) {
                    for (int j = 1; j < triangle[0].length-1; j++) {
                        triangle[i][j] = triangle[i-1][j]+triangle[i-1][j-1];
                    }
                }

                for (int i = 0; i < triangle[0].length; i++) {
                    for (int j = 0; j < i+1; j++) {
                        if(j==i){
                            System.out.println(triangle[i][j]);
                        }else{
                            System.out.print(triangle[i][j]+" ");
                        }
                    }
                }
                System.out.println();
            }

        }
        cin.close();
    }
}


