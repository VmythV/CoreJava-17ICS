package codes_my;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        if(N<=0) return;
        while(N!=1){
            if(N%2==0){
                N/=2;
                System.out.println(String.format("%d/2=%d",N*2,N));
            }else{
                N = N*3+1;
                System.out.println(String.format("%d*3+1=%d",(N-1)/3,N));
            }
        }


    }
}
