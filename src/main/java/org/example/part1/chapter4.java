package org.example.part1;

import java.util.Scanner;

public class chapter4 {
    public static void main(String[] args) {
        /**
        String doc ="dfja";
        String word ="dfdf" ;
        int count =0;
        for (int i = 0; i< doc.length(); i++){
            boolean isMatch = true;
            for (int j=0; j<word.length();j++){
                if(i+j>=doc.length()||doc.charAt(i+j)!=word.charAt(j)){
                    isMatch =false;
                    break;
                };
            }
            if(isMatch){
                count++;
                i+=word.length()-1;
            }
        }
         **/

        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine(); //공백포함 next는 공백까지
        String word =sc.nextLine();
        int count =0;
        int startIndex =0;
        while (true){
            int findIndex = doc.indexOf(word,startIndex);
            if (findIndex<0){
                break;
            }
            count++;
            startIndex = findIndex + word.length();
        }
        System.out.println(count);
    }
}
