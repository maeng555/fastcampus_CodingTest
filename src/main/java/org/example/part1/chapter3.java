package org.example.part1;

import java.util.Scanner;

public class chapter3 {
    public static int[] getAlpabat(String str) {
        int[] count = new int[26]; // 대소문자 구분을 안한다.
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                count[ch - 'A']++;
            } else if ('a' <= ch && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();  // 입력 받은 문자열
        int[] count = getAlpabat(str);  // 알파벳 개수 세기

        int maxCount = -1;
        char maxAlphbet = '?';

        // 가장 많이 나온 알파벳 찾기
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphbet = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphbet = '?';
            }
        }
        System.out.println(maxAlphbet);  // 결과 출력
    }
}