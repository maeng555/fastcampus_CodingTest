package org.example.study;

import java.util.Arrays;
import java.util.Scanner;

public class backjun1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] array = new int[a];
        int max = 0;
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
//            System.out.println(array[i]);
//             if (array[i]>0 && max<array[i]){
//                max = array[i];
//            }
        }
        Arrays.sort(array);
        max = array[a - 1]; //최댓값
        // 각 점수 / 최댓값 곱하기 100
        float sum = 0;
        for (int i = 0; i < a; i++) {
            sum += ((float) array[i] / max * 100);
        }
        float result = 0;
        result = sum / a;
        System.out.println(result);
    }
}
