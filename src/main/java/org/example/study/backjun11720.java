package org.example.study;

import java.util.Scanner;

public class backjun11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        char[] arr = b.toCharArray();

        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum += (char) Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);


    }
}

