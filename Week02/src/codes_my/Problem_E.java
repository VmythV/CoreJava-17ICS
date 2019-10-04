package codes_my;

import java.util.Scanner;

public class Problem_E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int M = cin.nextInt();
        while (M-- > 0) {
            int a = 0, b = 0;
            int A = cin.nextInt();
            int B = cin.nextInt();
            for (int i = 1; i < A; i++) {
                if (A % i == 0) {
                    a += i;
                }
            }
            for (int j = 1; j < B; j++) {
                if (B % j == 0) {
                    b += j;
                }
            }
            if(a==B&&b==A){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        cin.close();
    }
}

