package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Path2 {
        private static final String THIS_IS_FILE = " - это файл";
        private static final String THIS_IS_DIR = " - это директория";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                String read = scanner.nextLine();
                if(read.isEmpty()){
                    break;
                }

                if (Files.isRegularFile(Path.of(read))) {
                    System.out.println(Path.of(read) + THIS_IS_FILE);

                } else if (Files.isDirectory(Path.of(read))) {
                    System.out.println(Path.of(read) + THIS_IS_DIR);
                }else{
                    break;
                }

            }
        }
    }

