package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        // with try with resources filiInputStream avto close
        try (FileInputStream fileInputStream =new FileInputStream("text1");
             ObjectInputStream ois = new ObjectInputStream(fileInputStream);){

            Person[] people = (Person []) ois.readObject();
            System.out.println(Arrays.toString(people));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
