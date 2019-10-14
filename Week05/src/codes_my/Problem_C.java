package codes_my;

import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i*i*i;
            if(sum>n){
                System.out.println(i-1);
                break;
            }
        }
        cin.close();
    }
}
