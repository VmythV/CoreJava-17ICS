package codes_my;

import java.util.Scanner;
import java.util.Stack;

public class Problem_C {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String str = cin.nextLine();
        String exp[] = str.split("\\s+");
        Stack<Double> S = new Stack<>();
        for (String s : exp) {
            if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
                double b = S.peek();
                S.pop();
                double a = S.peek();
                S.pop();
                switch (s.charAt(0)) {
                    case '+':
                        S.push(a + b);
                        break;
                    case '*':
                        S.push(a * b);
                        break;
                    case '-':
                        S.push(a - b);
                        break;
                    case '/':
                        if (b != 0)
                            S.push(a / b);
                        break;
                }
            } else {
                S.push(Double.parseDouble(s));
            }
        }
        System.out.printf("%.2f", S.peek());
    }
}
