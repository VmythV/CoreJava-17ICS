package codes_my;

import java.util.LinkedList;
import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            LinkedList<Integer> q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                q.add(i);
            }
            int start = 0;
            for (int i = 0, j = q.size(); i < j - 1; i++) {
                start = (start + m - 1) % q.size();
                q.remove(start);
            }
            System.out.println(q.getFirst());
        }
    }

}
