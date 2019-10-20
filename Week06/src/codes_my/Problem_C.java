package codes_my;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem_C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            int N = cin.nextInt();
            System.out.println(jiecheng(N));
        }
        cin.close();
    }

    private static BigInteger jiecheng(int n) {
        BigInteger sum = new BigInteger("1");
        BigInteger one = new BigInteger("1");
        BigInteger N = new BigInteger(n+"");
        while (n>1){
            sum=sum.multiply(N);
            N=N.subtract(one);
            n--;
        }
        return sum;
    }
}
