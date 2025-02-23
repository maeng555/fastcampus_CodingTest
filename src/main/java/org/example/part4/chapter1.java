package org.example.part4;

import java.util.Scanner;

//완전탐색
public class chapter1 {
    static boolean[] isEurekaNumber = new boolean[1001];
    public static void preprocess(){
        //1 K보다 작은 삼각수를 구한다.
        int[] triangleNumbers = new int[50];
        int triangleNumberCount =0;
        for (int i=1; ;i++){
            int triangleNumber = i*(i+1)/2;
            if (triangleNumber>1000) break;
            triangleNumbers[triangleNumberCount++]=triangleNumber;

        }
        //2. 구해진 세개의 합으로 K를 나타낼수있는지확인한다.
        boolean[] isSumOfTriangleNumber =new boolean[1001];
        for (int i=0; i<triangleNumberCount;i++){
            for (int j=0;j<triangleNumberCount;j++){
                int sum = triangleNumbers[i]+triangleNumbers[j];
                if (sum <1000) isSumOfTriangleNumber[sum]=true;
            }
        }
        for (int i=0; i<1000;i++){
            if (!isSumOfTriangleNumber[i]) continue;
            for (int j=0; j<triangleNumberCount; j++){
                int sum=i+triangleNumbers[i];
                if (sum<1000) isEurekaNumber[sum]=true;
            }
        }

    }
    public static void main(String[] args) {
        preprocess();

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0){
            int K =sc.nextInt();

            System.out.println(isEurekaNumber[K]? "1" : "0");
        }


    }
}
