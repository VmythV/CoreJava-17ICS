package codes_my;

public class Problem_D {
    public static void main(String[] args) {
        for(int i=1;i<10000000;i++){
            if(add(i)==i){
                System.out.print(i+" ");
            }
        }
    }

	public static int add(int n) {
		int sum = 0;
		for(;n>0;n/=10){
			sum+=fac(n%10);
		}
		return sum;
	}

    public static int fac(int n) {
        if (n == 0)
            return 1;
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t = t * i;
        }
        return t;
    }
}
