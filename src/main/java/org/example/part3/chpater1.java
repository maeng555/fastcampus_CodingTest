package org.example.part3;

import java.util.Scanner;

public class chpater1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map= new char[N][M];
        for (int i=0;i<N;i++) {
            map[i] = sc.next().toCharArray(); //n은 열   m =column 행
        }
            //각 행/열의 경비원 확인
            int existRowCount =0;
            for (int i=0;i<N;i++) {
                boolean exist =false;
                for (int j=0;j<M;j++){
                    if (map[i][j]=='X'){
                        exist=true;
                        break;

                    }

                }
                if (exist) existRowCount++;
            }
        int existColCount =0;
        for (int i=0;i<M;i++) {
            boolean exist = false;
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;

                }

            }
            if (exist) existColCount++;
        }




            //보호받지못한 경비 행/열수
            int needRowCount =N-existRowCount;
            int needColCount =M-existColCount;

            //둘중큰값
        System.out.println(Math.max(needRowCount,needColCount));

    }
    /**
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    char[][] map = new char[N][M];
        for (int i = 0; i < N; i++)
    map[i] = sc.next().toCharArray();

    boolean[] rowExist = new boolean[N];
    boolean[] colExist = new boolean[M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
            if (map[i][j] == 'X') {
        rowExist[i] = true;
        colExist[j] = true;
    }

    int rowNeedCount = N;
    int colNeedCount = M;
        for (int i = 0; i < N; i++)
            if (rowExist[i]) rowNeedCount--;
        for (int i = 0; i < M; i++)
            if (colExist[i]) colNeedCount--;

        System.out.println(Math.max(rowNeedCount, colNeedCount));
    **/
}
