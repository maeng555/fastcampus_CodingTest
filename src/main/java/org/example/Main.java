package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = a;
        String b = sc.next();
        char[] arr = b.toCharArray();

        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += (char) Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);


    }
}