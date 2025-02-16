package org.example.part3;

import java.io.*;

//수정렬 (오름차순
public class chapter3 {
    public static void main(String[] args) throws IOException { //버퍼를 사용하려면 스로우 IO인셉션 사용
        /** 번외  빠른 a+b 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //스캐너보다 출력값이빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String[] nums = br.readLine().split("");
            int a= Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bw.write(a+b+"\n");//문자열 스티링 " 확인

        }
        bw.flush(); // 버퍼사용할때 필수
         **/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //스캐너보다 출력값이빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] cnt =new int[10011];
        for (int i=0;i<N;i++){
            cnt[Integer.parseInt(br.readLine())]++;

        }
        for (int i=1;i<=10000;i++){
            while (cnt[i]-- >0){
                bw.write(i + "\n");
            }
        }
        bw.flush();

    }

}
