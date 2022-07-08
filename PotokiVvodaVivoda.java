package com;

import java.awt.*;
import java.io.*;
import java.util.Arrays;

public class PotokiVvodaVivoda<fileWrite> {
    public static void main(String[] args) throws IOException {
        String b = null;
        String input = "text1";
        String output = "text2";

        FileReader fileRead = null;
        FileWriter fileWrite = null;
        try {
            fileWrite = new FileWriter(output);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileRead = new FileReader(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileWrite = new FileWriter(output);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (fileRead.ready()){

                  fileWrite.write(fileRead.read());
                 String result = fileWrite.toString();
            System.out.println(result);
            }
       // System.out.println(result);
        fileRead.close();

        fileWrite.close();
        }


    }



