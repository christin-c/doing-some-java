package com.example.coding.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // FileReader = read the contents of a file as a stream of characters. One by one
        //				read() returns an int value which contains the byte value
        //				when read() returns -1, there is no more data to be read

        try {
            FileReader reader = new FileReader("/Users/christin/IdeaProjects/Some-Java/doing-some-java/src/com/example/coding/filereader/art.txt");
            int data = reader.read();
            while(data != -1) { // loop until end of text
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
