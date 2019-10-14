package codes_my;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char[] chars = str.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z'){
                arr.add(chars[i]);
            }
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                arr.add(chars[i]);
            }
        }
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i));
            }
            cin.close();
    }
}

