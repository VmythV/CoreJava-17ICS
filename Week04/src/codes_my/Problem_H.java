package codes_my;

import java.util.Scanner;

public class Problem_H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            int x = cin.nextInt();
            if(n==0&&x==0) break;
            int[] arr = new int[n];
            int[] arr2 = new int[n+1];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextInt();
            }
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                if(x>arr[i]) num++;
            }
            for (int i = 0; i < num; i++) {
                arr2[i] = arr[i];
            }
            arr2[num] = x;
            for (int i = num+1; i < arr2.length; i++) {
                arr2[i] = arr[i-1];
            }
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+" ");
            }
        }
        cin.close();
    }
}

