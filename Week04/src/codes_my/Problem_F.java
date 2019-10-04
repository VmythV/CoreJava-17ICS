package codes_my;

import java.util.Scanner;

public class Problem_F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            if(n==0) break;
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = Math.abs(arr[i]);
            }
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-i-1; j++) {
                    if(arr2[j]<arr2[j+1]){
                        int demo = arr2[j];
                        arr2[j] = arr2[j+1];
                        arr2[j+1] = demo;
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        cin.close();
    }
}

