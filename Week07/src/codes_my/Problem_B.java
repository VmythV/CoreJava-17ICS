package codes_my;

import java.util.Scanner;

public class Problem_B {
    public static class model {
        private int a;
        private int b;

        public model(int b, int a) {
            this.a = a;
            this.b = b;
        }

        public void setA(int Exp){
            this.a = Exp;
        }
            public void setB(int Coe){
            this.b = Coe;
        }

        public int getA() {
            return this.a;
        }

        public int getB() {
            return this.b;
        }
    }
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int m = cn.nextInt();
        int n = cn.nextInt();
        model[] models = new model[m+n];
        for (int i = 0; i < n+m; i++) {
            int coe = cn.nextInt();
            int exp = cn.nextInt();
            models[i] = new model(coe, exp);
        }
        for(int i =0;i<n+m;i++){
            for(int j = i+1;j<n+m;j++){
                if(models[i].getA()<models[j].getA()){
                    model pl = models[j];
                    models[j] = models[i];
                    models[i] =pl;
                }else if(models[i].getA()==models[j].getA()){
                    models[i].setB(models[i].getB()+models[j].getB());
                    models[j].setB(0);
                }
            }
        }
        for(int i = 0;i<n+m;i++){
            if(models[i].getB()==0) continue;
            System.out.println(models[i].getB()+" "+models[i].getA());
        }
    }
}


