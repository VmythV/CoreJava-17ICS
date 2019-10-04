package codes_my;

import java.util.Scanner;

public class Problem_A {

    static String st = "";

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String x = cin.nextLine();
            if(x.equals("End of file")){
                break;
            }
            cheak(x);
        }
        cin.close();
    }

    public static void cheak(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '.') {
                if (Integer.valueOf(st) < 0 || Integer.valueOf(st) > 255) {
                    System.out.println('N');
                    st = "";
                    return;
                }
                st = "";
            } else if (x.charAt(i) < '0' || x.charAt(i) > '9') {
                System.out.println('N');
                st = "";
                return;
            } else
                st += x.charAt(i);
        }
        if (Integer.valueOf(st) < 0 || Integer.valueOf(st) > 255) {
            System.out.println("N");
        } else
            System.out.println("Y");
        st = "";
    }
}
