package codes_my;

import java.util.Scanner;

public class Problem_G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int X = cin.nextInt();
        int Y = cin.nextInt();
        int sum = 0;
        for(;X<=Y;X++){
            if(X%3==1&&X%5==3){
                sum+=X;
            }
        }
        System.out.println(sum);
        cin.close();
    }

}
