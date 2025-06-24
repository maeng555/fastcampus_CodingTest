package org.example.study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            count.put(a,null);
        }
        for (int i=1; i<31;i++){
            if(!count.containsKey(i)){
                System.out.println(i);
            }
        }



    }
}
