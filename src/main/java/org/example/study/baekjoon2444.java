package org.example.study;

import java.util.Scanner;

public class baekjoon2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a-1; i>=1; i--){
            for(int j=1; j<=a-i; j++){
                System.out.print(" ");
            }

            for (int j=2*i-1; j>=1;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
