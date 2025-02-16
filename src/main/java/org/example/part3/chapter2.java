package org.example.part3;

import java.util.Scanner;

//줄세우기 문제 백준 10431
public class chapter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        while (P-- > 0){ //P가 1씩감소
            int T = sc.nextInt();
            int[] h = new int[20];
            for (int i=0; i<20; i++){
                h[i]=sc.nextInt();
            }
            int cnt =0;
            int[] sorted= new int[20];
            for (int i=0;i<20;i++){
                boolean find =false;
                for (int j=0; j<i;j++){

                    if(sorted[i]>h[j]){
                        find=true;
                        for (int k=i-1;k>=j;k--){
                            sorted[k+1]=sorted[k];
                            cnt++;
                        }
                        sorted[j]=h[i];
                        break;
                    }
                    if (!find){
                        sorted[i]=h[i];
                    }
                    System.out.println(T+""+cnt);

                }
            }



        }
    }
}
