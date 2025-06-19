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
//선택정렬로 풀기
//package org.example.study;
//
//import java.util.Scanner;
//
//public class baekjoon1427 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        int[] digits = new int[input.length()];
//
//        // 1. 문자열 → 정수 배열로 변환
//        for (int i = 0; i < input.length(); i++) {
//            digits[i] = input.charAt(i) - '0'; // '3' → 3
//        }
//
//        // 2. 선택 정렬 (내림차순)
//        for (int i = 0; i < digits.length - 1; i++) {
//            int maxIdx = i;
//            for (int j = i + 1; j < digits.length; j++) {
//                if (digits[j] > digits[maxIdx]) {
//                    maxIdx = j;
//                }
//            }
//
//            // swap
//            int temp = digits[i];
//            digits[i] = digits[maxIdx];
//            digits[maxIdx] = temp;
//        }
//
//        // 3. 출력
//        for (int digit : digits) {
//            System.out.print(digit);
//        }
//    }
//}
