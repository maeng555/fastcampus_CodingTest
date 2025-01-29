package org.example.part1;

import java.util.Scanner;

public class chapter5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String current = sc.next();
        String drop = sc.next();

        String[] currentUnit = current.split(":");
        int currentHour = Integer.parseInt(currentUnit[0]);
        int currentMinute = Integer.parseInt(currentUnit[1]);
        int currentSecond = Integer.parseInt(currentUnit[2]);
        int currentAmount = currentHour*3600 + currentMinute*60 + currentSecond;
        String[] dropUnit = current.split(":");
        int dropHour = Integer.parseInt(currentUnit[0]);
        int dropMinute = Integer.parseInt(currentUnit[1]);
        int dropSecond = Integer.parseInt(currentUnit[2]);
        int dropAmount = dropHour*3600+dropMinute*60 +dropSecond;

        int needAmount = dropAmount -currentAmount;
        if(needAmount<=0){
            needAmount += 24*3600;
        }
        int needHour= needAmount/3600;
        int needMinute = (needAmount%3600)/60;
        int needSecond = needAmount%60;
        System.out.printf("%02d:%02d:%02d",needHour,needMinute,needSecond);
    }
}
