package codes_my;

import java.util.Scanner;

public class Problem_G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while(T-->0){
            int[] arr1 = new int[9];
            int[] arr2 = new int[9];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = cin.nextInt();
            }
            arr2[0] = arr1[0];
            int low = 0;
            int high = 0;
            int flag = 1;
            for (int i = 1; i < arr1.length; i++) {
                if(arr1[i]>arr2[flag-1]){
                    arr2[high+low+1] = arr1[i];
                    low++;
                }else{
                    for (int j = 8; j >0; j--) {
                        arr2[j]=arr2[j-1];
                    }
                    arr2[0] = arr1[i];
                    high++;
                    flag++;
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+" ");
            }
        }
        cin.close();
    }
}

