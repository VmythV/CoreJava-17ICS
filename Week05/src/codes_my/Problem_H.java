package codes_my;

import java.util.Arrays;
import java.util.Scanner;

public class Problem_H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        char[] zimu = new char[26];
        for (int i=97; i <=122 ; i++) {
            zimu[i-97] = (char)i;
        }

        int[] number = new int[26];
        Arrays.fill(number,0);

        while (true){
            String str = cin.next();
            String s = str.toLowerCase();
            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < zimu.length; j++) {
                    if(arr[i]==zimu[j]){
                        number[j]++;
                    }
                }
            }
            if(arr[arr.length-1]=='#')
                break;
        }
        for (int i = 0; i < zimu.length; i++) {
            System.out.println(zimu[i]+" "+number[i]);
        }
    }
}
