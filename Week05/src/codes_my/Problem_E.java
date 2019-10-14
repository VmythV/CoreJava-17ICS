package codes_my;

import java.util.Scanner;

public class Problem_E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String str = cin.nextLine();
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>='a'&&arr[i]<='z'){
                    arr[i] = (char) (arr[i]-32);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        cin.close();
    }
}
