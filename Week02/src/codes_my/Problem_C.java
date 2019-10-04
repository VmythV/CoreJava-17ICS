package codes_my;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int flag = 1;
        for (int i = 2; i < N-1; i++) {
            if(N%i==0){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        cin.close();
    }

}

