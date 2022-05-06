package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FileReader fileReader;
        FileWriter fileWriter;
        int ch;
        try {
            fileReader = new FileReader("input.txt");
            fileWriter = new FileWriter("output.txt");

            while ((ch = fileReader.read()) != -1) {
                fileWriter.write(ch);
            }

            fileReader.close();
            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
