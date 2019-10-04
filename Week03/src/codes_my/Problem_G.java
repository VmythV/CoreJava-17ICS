package codes_my;

import java.util.Scanner;

public class Problem_G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            while(true){
                int test =cin.nextInt();
                int max=test;
                if(test==0) break;
                while(test!=0){
                    if(test>max) max=test;
                    test=cin.nextInt();
                }
                System.out.println(max);
                if(test==0) break;
            }
        }
    }
}
