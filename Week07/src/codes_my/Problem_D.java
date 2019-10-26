package codes_my;

import java.util.Scanner;

public class Problem_D {
    public static class scholarship{
          String name;
          int final_score;
          int class_score;
          char isCadres;
          char isWest;
          int paper;
          int total = 0;

        public scholarship(String name, int final_score, int class_score, char isCadres, char isWest, int paper) {
            this.name = name;
            this.final_score = final_score;
            this.class_score = class_score;
            this.isCadres = isCadres;
            this.isWest = isWest;
            this.paper = paper;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        scholarship[] ship = new scholarship[T];
        for (int i = 0; i < T; i++) {
            String a = in.next();
            int b = in.nextInt();
            int c = in.nextInt();
            char d = in.next().charAt(0);
            char e = in.next().charAt(0);
            int f = in.nextInt();
            ship[i] = new scholarship(a,b,c,d,e,f);

            if(ship[i].final_score >80&&ship[i].paper>=1){
                ship[i].total  = ship[i].total+8000;
            }
            if(ship[i].final_score >85&&ship[i].class_score>80){
                ship[i].total  = ship[i].total+4000;
            }
            if(ship[i].final_score >90){
                ship[i].total  = ship[i].total+2000;
            }
            if(ship[i].final_score >85&&ship[i].isWest=='Y'){
                ship[i].total  = ship[i].total+1000;
            }
            if(ship[i].class_score >80&&ship[i].isCadres=='Y'){
                ship[i].total  = ship[i].total+850;
            }
        }
        int max = 0;
        int t=0;
        for (int i = 0; i < T; i++) {
            if(ship[i].total>max){
                max = ship[i].total;
                t=i;
            }
        }
        System.out.println(ship[t].name);
        System.out.println(ship[t].total);
        int maxmoney = 0;
        for (int i = 0; i < T; i++) {
            maxmoney+=ship[i].total;
        }
        System.out.println(maxmoney);
        in.close();
    }
}
