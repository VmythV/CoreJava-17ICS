package codes_my;

import java.util.Scanner;

public class Problem_J {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String str = cin.next();
            char[] chs=str.toCharArray();
            for(int i = 0;i<chs.length;i++){
                if(chs[i]>='a'&&chs[i]<='c'){
                    chs[i]='2';
                }else if(chs[i]>='d'&&chs[i]<='f'){
                    chs[i]='3';
                }else if(chs[i]>='g'&&chs[i]<='i'){
                    chs[i]='4';
                }else if(chs[i]>='j'&&chs[i]<='l'){
                    chs[i]='5';
                }else if(chs[i]>='m'&&chs[i]<='o'){
                    chs[i]='6';
                }else if(chs[i]>='p'&&chs[i]<='s'){
                    chs[i]='7';
                }else if(chs[i]>='t'&&chs[i]<='v'){
                    chs[i]='8';
                }else if(chs[i]>='w'&&chs[i]<='z'){
                    chs[i]='9';
                }else if(chs[i]>='A'&&chs[i]<'Z'){
                    chs[i] =(char)(chs[i]+33);
                }else if(chs[i]=='Z'){
                    chs[i]='a';
                }
            }
            for(int i = 0;i<chs.length;i++){
                System.out.print(chs[i]);
            }
            System.out.println();
        }
        cin.close();
    }
}

