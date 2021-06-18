package com.example.coding.readCSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String file = "/Users/christin/IdeaProjects/Some-Java/doing-some-java/src/com/example/coding/readCSV/students.csv";

        // reads the text from an Input stream by buffering (zwischenspeichern) chars, that speeds up the process
        // several read operations are combined
        BufferedReader reader;
        String line;

        try{
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for(String s: row) {
                    // left justify - and 10 spaces
                    System.out.printf("%-10s", s);
                }
                System.out.println();
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
