package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(printIfPalindrome("Den laks skal ned"));



    }


    public static boolean  printIfPalindrome(String k){
        String temp = "";

        for(int i=k.length()-1; i>=0 ;i--){
            temp = temp+k.charAt(i);
            }
        System.out.println(temp.toLowerCase());
        System.out.println(k);
        if (k.toLowerCase().equals(temp.toLowerCase())){

            return true;

        }else {
            return false;
        }
    }
}
