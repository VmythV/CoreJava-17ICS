package codes_my;

import java.util.Scanner;

public class Problem_H {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int t=1;
            int n = cn.nextInt();
            if(!test(n))
                System.out.println("Unlucky");
            else{
                for(int i =2;i<=n;i++){
                    if(test(i)) t++;
                }
                System.out.println(t);
            }

        }
    }
    public static boolean test(int t){
        while(t>0){
            if(t%10==0) return false;
            t/=10;
        }
        return true;
    }
}
