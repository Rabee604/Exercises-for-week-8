package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[12][1];
    public static char[] consonant = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Z'};

    public static void main(String[] args) {

        File file = new File("src/com/company/Data.txt");

        try {
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNextLine()) {
                text[i] = scan.nextLine().split(" ");
                System.out.println(text[i].length);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


    }

    public static void printWordsWithDoubleConsonant() {
        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                for (int j = 0; j < s.length(); j++) {
                    char k = s.charAt(j);
                    if (isConsonat(k) && j> 0) {
                        char p = s.charAt(j - 1);
                        if (p == k) {
                            System.out.println(s);


                        }

                    }
                }

            }

        }

    }


    public static boolean isConsonat(char h) {
        char c = Character.toLowerCase(h);
        if (c == 'i' || c == 'y' || c == 'e' || c == 'æ' || c == 'ø' || c == 'a' || c == 'u' || c == 'o' || c == 'å') {
            return false;
        } else if(Character.isDigit(h)) {
            return true;
        }

        return true;
    }
}


