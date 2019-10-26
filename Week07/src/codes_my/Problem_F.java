package codes_my;

import java.lang.reflect.Array;
import java.util.*;

public class Problem_F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        while (x-->0){
            int m =cin.nextInt();
            TreeSet<rectangle> set = new TreeSet<>();
            for (int i = 0; i < m; i++) {
                int num1 = cin.nextInt();
                int rec_long1 = cin.nextInt();
                int rec_short1 = cin.nextInt();
                if (rec_long1<rec_short1){
                    int temp = rec_long1;
                    rec_long1 = rec_short1;
                    rec_short1 = temp;
                }
                rectangle rec = new rectangle(num1,rec_long1,rec_short1);
                set.add(rec);

            }

            Iterator<rectangle> it = set.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }

        cin.close();
    }
    public static class rectangle implements Comparable<rectangle>{
        private int num;
        private int rec_long;
        private int rec_short;

        public rectangle() {
        }

        public rectangle(int num, int rec_long, int rec_short) {
            this.num = num;
            this.rec_long = rec_long;
            this.rec_short = rec_short;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getRec_long() {
            return rec_long;
        }

        public void setRec_long(int rec_long) {
            this.rec_long = rec_long;
        }

        public int getRec_short() {
            return rec_short;
        }

        public void setRec_short(int rec_short) {
            this.rec_short = rec_short;
        }

        @Override
        public String toString() {
            return num+" "+rec_long+" "+rec_short;
        }

        @Override
        public int compareTo(rectangle o) {
            int flag1 = Integer.compare(num,o.num);
            if (flag1!=0)
                return flag1;
            else{
                int flag2 = Integer.compare(rec_long,o.rec_long);
                if (flag2!=0)
                    return flag2;
                return Integer.compare(rec_short,o.rec_long);
            }
        }
    }
}
