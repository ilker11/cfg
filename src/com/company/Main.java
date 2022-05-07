package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileReader fileReader;
        FileWriter fileWriter;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        System.out.println("You have made changes:" + name);
        int ch;
        try {
            fileReader = new FileReader("D:\\ooop\\input.txt");
            fileWriter = new FileWriter("D:\\ooop\\output.txt");

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
