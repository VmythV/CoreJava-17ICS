package codes_my;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_UP;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            BigDecimal a = cin.nextBigDecimal();
            BigDecimal b = cin.nextBigDecimal();
            int c = cin.nextInt();

            System.out.println(a.divide(b,c,ROUND_UP));
        }
        cin.close();
    }
}
