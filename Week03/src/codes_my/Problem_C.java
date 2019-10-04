package codes_my;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double t=0;
        int n = cin.nextInt();
        if(n>1000000) return;
        for(int i = 1;i<=n;i++){
            t  =  t + 1.0/i;
        }
        System.out.printf("%.6f",t);
    }
}
