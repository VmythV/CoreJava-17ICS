package codes_my;

import java.util.Scanner;

public class Problem_A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t-->0){
            int a = cin.nextInt();
            int b = cin.nextInt();
            for(int i=1;i<=b;i++)
            {
                if(i%2==1)
                {
                    for(int j=1;j<=a;j++)
                    {
                        for(int k=1;k<=a;k++)
                        {
                            if(k==j||k==a-j+1)
                                System.out.print("X");
                            else
                                System.out.print(" ");
                            if((j<=a/2&&k==a-j+1)||(j>a/2&&k==j))
                                break;
                        }
                        System.out.println();
                    }
                }
                else
                {
                    for(int j=2;j<=a-1;j++)
                    {
                        for(int k=1;k<=a;k++)
                        {
                            if(k==j||k==a-j+1)
                                System.out.print("X");
                            else
                                System.out.print(" ");
                            if((j<=a/2&&k==a-j+1)||(j>a/2&&k==j))
                                break;
                        }
                        System.out.println();
                    }
                }
            }
            if(b%2==0)
            {
                for(int i=1;i<=a;i++)
                {
                    if(i==1||i==a)
                        System.out.print("X");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            if(t!=0)
                System.out.println();
        }
    }

}
