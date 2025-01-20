package org.example.part1;

import java.util.Scanner;


public class chapter1 {
    public static void main(String[] args) {
        //알파벳으로 이루어진 문자열이 주어질때 소문자는 대문자 , 대문자는 소문자로 문자열을 출력
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); //공백 띄어쓰기로 인식
        for (int i=0; i<str.length();i++){
            char ch = str.charAt(i); // 그 번째의 원소를 가져와
            if('A'<=ch && ch<='Z'){
                System.out.print((char) ('a'+ch-'A'));
            }else{
                System.out.print((char)('A'+ch-'a'));
            }

        }

    }
}
