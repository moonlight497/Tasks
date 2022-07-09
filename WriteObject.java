package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] person1 = {new Person("Антон",20,"Man"), new Person("Дима",20,"Man")};
        // with try with resources fileOutput avto close
        try (FileOutputStream fileOutput = new FileOutputStream("text1");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutput);) {

            objectOutputStream.writeObject(person1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
