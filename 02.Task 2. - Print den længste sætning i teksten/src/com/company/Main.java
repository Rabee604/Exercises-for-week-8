package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        longestSentence();
    }


    public static void longestSentence() {
        String longestSentence = "";
        File file = new File("src/com/company/Data.txt");
        try {
            Scanner scan = new Scanner(file);
            int i = 0;
            while (scan.hasNextLine()) {
                String[] text = scan.nextLine().split("\\. ");
                longestSentence = text[0];
                for (String sentance : text) {
                    if (sentance.length() > longestSentence.length()) {
                         longestSentence=sentance;

                    }

                }
                i++;

            }
            System.out.println("The longest sentence is :" + longestSentence);


        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }
    }
}


