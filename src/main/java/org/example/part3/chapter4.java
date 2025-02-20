package org.example.part3;

import java.util.Scanner;

public class chapter4 {
    public static void main(String[] args) {
        //두수의 합 중복제외
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //7
        int[] a = new int[N]; //1234567
        for (int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }//1234567
        int X=sc.nextInt();
        boolean[] exist =new boolean[10000001];
        for (int i=0; i<N;i++){
            exist[a[i]]=true;
        }
        int ans=0;
        for (int i=0; i<N; i++){
            int pairValue= X-a[i];
            if(0<=pairValue&&pairValue<=1000000){
                ans +=exist[pairValue]?1:0;
            }

        }
        System.out.println(ans/2);
    }
}
