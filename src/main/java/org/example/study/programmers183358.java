package org.example.study;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class programmers183358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arrs = a.split(",");
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = String.valueOf(Integer.parseInt(arrs[i]));
        }
        Arrays.sort(arrs);
        int[] temp = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (Objects.equals(arrs[i], arrs[j])) { //equals는 값을 비교 ==을하면 안돼
                    temp[i]++;
                }
            }
        }
        int maxindex = 0;
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] > temp[maxindex]) {
                maxindex = i;
            }
        }
        int sameindex = temp[maxindex];
        int cnt = 0;
        String max = arrs[maxindex];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == sameindex) {
                if (!arrs[i].equals(max)) {
                    cnt++;
                }
            }
        }
        if (cnt > 0) {
            System.out.println(-1);
        } else {
            System.out.println(max);
        }
    }
}
