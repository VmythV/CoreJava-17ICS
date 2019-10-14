package codes_my;

import java.util.Scanner;

public class Problem_J {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] contrast1 = {"0000","0001","0010","0011","0100","0101","0110","0111",
                            "1000","1001","1010","1011","1100","1101","1110","1111"};

        char[] contrast2 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (cin.hasNext()){
            String str = cin.nextLine();
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < contrast1.length; j++) {
                    if(arr[i]==contrast2[j]){
                        System.out.print(contrast1[j]);
                    }
                }
            }
            System.out.println();
        }
        cin.close();
    }
}
