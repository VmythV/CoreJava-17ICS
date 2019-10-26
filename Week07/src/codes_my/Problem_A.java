package codes_my;

import java.util.*;

public class Problem_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        List<Score> scores = new LinkedList<>();
        while (cin.hasNext()) {
            int sum = 0, a = 0;
            String[] string = cin.nextLine().split("\\s+");
            for (int i = 1; i < string.length; i++) {
                if (!string[i].contains("(")) {
                    if (Integer.parseInt(string[i]) <= 0) ++a;
                }
                if (string[i].contains("(") || string[i].contains(")")) {
                    String s1 = string[i].substring(string[i].indexOf("(") + 1, string[i].indexOf(")"));
                    String s2 = string[i].substring(0, string[i].indexOf("("));
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    sum += (num1 * n + num2);
                }
                if (!(string[i].contains("-") || string[i].contains("("))) {
                    sum += Integer.parseInt(string[i]);
                }
            }
            scores.add(new Score(string[0], m - a, sum));
        }
        scores.sort((o1, o2) -> {
            int d = o2.ac - o1.ac;
            if (d != 0) return d;
            d = o1.time - o2.time;
            if (d != 0) return d;
            return o1.name.compareTo(o2.name);
        });
        for (Score s : scores) {
            if (s.name.length() == 0) continue;
            System.out.println(s);
        }

        cin.close();
    }

    static class Score {
        String name;
        int ac;
        int time;

        Score(String name, int ac, int time) {
            this.name = name;
            this.ac = ac;
            this.time = time;
        }

        @Override
        public String toString() {
            return String.format("%-10s %2d %4d", this.name, this.ac, this.time);
        }
    }
}