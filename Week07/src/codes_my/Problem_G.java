package codes_my;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Problem_G {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        TreeSet<Person> set=new TreeSet<>();
        for (int i = 0; i < T; i++) {
            String name = cin.next();
            int year = cin.nextInt();
            int month = cin.nextInt();
            int day = cin.nextInt();
            Person per=new Person(name, year, month, day);
            set.add(per);
        }
        Iterator<Person> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }

        cin.close();
    }
    public static class Person implements Comparable<Person> {
        private String name;
        private int year;
        private int month;
        private int day;

        public Person() {
        }

        public Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        @Override
        public int compareTo(Person o) {
            int flag1 = Integer.compare(year, o.year);
            if(flag1!=0) //年份不同
                return flag1;
            else //年级相同
            {
                int flag2=Double.compare(month, o.month);
                if(flag2!=0) //月份不同
                    return flag2; //成绩降序
                else //成绩相同
                    return Long.compare(day, o.day);
            }
        }
    }
}
