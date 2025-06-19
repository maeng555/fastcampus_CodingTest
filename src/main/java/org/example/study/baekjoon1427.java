package org.example.study;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1427 {
    public static void main(String[] args) {
        //sort inside
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (char) Integer.parseInt(String.valueOf(arr[i]));
//            arr[i] = (char) (arr[i] - '0'); // 문자 '3' → 숫자 3
//        }
        Arrays.sort(arr);
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }

    }
}
