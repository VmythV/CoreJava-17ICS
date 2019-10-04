package codes_my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Integer> arr2 = new ArrayList<>();
        int T = cin.nextInt();
        int[] arr1 = new int[T];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = cin.nextInt();
        }
        arr2.add(arr1[0]);
        int flag = 1;
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if(arr1[i]==arr2.get(j)){
                    flag = 0;
                }
            }
            if(flag == 1){
                arr2.add(arr1[i]);
            }
            flag = 1;

        }
        Collections.sort(arr2);
        System.out.println(arr2.size());
        for (int i = 0; i < arr2.size(); i++) {
            System.out.print(arr2.get(i)+" ");
        }
        cin.close();
    }
}

