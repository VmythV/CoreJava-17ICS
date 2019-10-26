package codes_my;

import java.util.*;

public class Problem_C {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        boolean f = false;
        while (cin.hasNext()) {
            String s = cin.nextLine();
            if (s.equals("%%%")) {
                f = true;
                continue;
            }
            if (!f) {
                String[] t = s.split(" ");
                map.put(t[0], Integer.parseInt(t[2]));
            } else {
                String[] d = s.split(" ");
                if (s.contains("*")) {
                    String[] t = new String[d.length];
                    int k, j = 0;
                    for (int i = 0; i < d.length; i++) {
                        if (!d[i].equals("*")) t[j++] = d[i];
                        else {
                            k = map.get(t[j - 1]) * map.get(d[i + 1]);
                            t[j - 1] = String.valueOf(k);
                            map.put(t[j - 1], k);
                            i++;
                        }
                    }
                    sum(map, t, j);
                } else sum(map, d, d.length);
            }
        }
        cin.close();
    }

    private static void sum(Map<String, Integer> map, String[] d, int length) {
        int sum = map.get(d[0]);
        for (int i = 1; i < length; i++) {
            if (d[i].equals("+")) {
                sum += map.get(d[i + 1]);
                i++;
            } else if (d[i].equals("-")) {
                sum -= map.get(d[i + 1]);
                i++;
            }
        }
        System.out.println(sum);
    }
}