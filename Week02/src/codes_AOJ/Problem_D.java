package codes_AOJ;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n % 2 == 0) --n;
        n = (n + 1) / 2;
        System.out.println(n * n);
    }
}