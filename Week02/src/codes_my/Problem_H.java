package codes_my;

import java.util.Scanner;

public class Problem_H {

    public static boolean isNumber(int n){
        boolean flag = true;
        if(n==1||n%2==0){
            flag = false;
        }
        if(n==2) flag = true;
        for(int i = 3;i<n;i+=2){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int T=0;
        for(int i=(int)Math.sqrt(a)+1;i>0;i-=2){
            for(int j = (int)Math.sqrt(a)-1;j<=a;j+=2){
                if(isNumber(i)&&isNumber(j)){
                    if(i+j==a) T++;
                }
            }
        }
        System.out.println(T);
        cin.close();
    }
}