package org.example.study;

import java.util.Arrays;
import java.util.Scanner;
//오름차순 정렬 첫번째 줄 개수, 두번째 ~n번째 줄 오름차순 해야 할 수
public class baekjoon2750 {
    public static void main(String[] args) {
        //sort 함수
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i =0; i<a; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 오름차순

        for (int j=0; j<a;j++){
            System.out.println(arr[j]);
        }

    }
}
