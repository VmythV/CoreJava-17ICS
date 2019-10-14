package codes_my;

import java.util.Scanner;

public class Problem_B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char[] chars = str.toCharArray();
        int flag = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='0'&&chars[i]<='9'){
                flag++;
            }
        }
        System.out.println(flag);
        cin.close();
    }
}
