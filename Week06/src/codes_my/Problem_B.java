package codes_my;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            System.out.println(a.add(b));
        }
        cin.close();
    }
}
