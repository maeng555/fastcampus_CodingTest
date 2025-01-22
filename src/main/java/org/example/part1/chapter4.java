package org.example.part1;

public class chapter4 {
    public static void main(String[] args) {
        String doc ="dfja";
        String word ="dfdf" ;
        for (int i = 0; i< doc.length(); i++){
            boolean isMatch = true;
            for (int j=0; j<word.length();j++){
                if(i+j>=doc.length()||doc.charAt(i+j)!=word.charAt(j)){
                    isMatch =false;
                    break;
                };
            }
        }
    }
}
