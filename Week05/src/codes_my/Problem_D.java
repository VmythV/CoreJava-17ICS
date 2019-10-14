package codes_my;

import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        char[] arr = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                flag = false;
            }
        }
        if(flag == true){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }
        cin.close();
    }
}
