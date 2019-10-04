package codes_my;

import java.util.Scanner;

public class Problem_I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int t = cin.nextInt();
            if(t<=100&&t>=90){
                System.out.println("A");
            }else if(t<90&&t>=80){
                System.out.println("B");
            }else if(t<80&&t>=70){
                System.out.println("C");
            }else if(t<70&&t>=60){
                System.out.println("D");
            }else if(t<60&&t>=0){
                System.out.println("E");
            }else{
                System.out.println("Score is error!");
            }
        }
        cin.close();
    }

}