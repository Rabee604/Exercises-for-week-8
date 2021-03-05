package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    private static String[][] text = new String[12][1];
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
        printPartOfWord("København",2, 19);


    }


    public static void printPartOfWord(String by, int k, int m ) {
        try {
            System.out.println(by.substring(k,k+m));
            

        } catch (StringIndexOutOfBoundsException e) {
            if(k<by.length()){
                System.out.println(by.substring(k));

            }else {
                System.out.println(e.getMessage());
            }

        }
    }
}
