package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static boolean isAnnogram(String word1, String word2){
        if(word1.length()!=word2.length()){
            return false;
        }
        char[] chars1=word1.toCharArray();
        char[] chars2=word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if(chars1[i] != chars2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "godo";
        String word2 = "godd";
        boolean xz = isAnnogram(word1,word2);
        System.out.println(xz);
    }
}
