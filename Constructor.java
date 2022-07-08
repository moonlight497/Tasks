package com;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Constructor {
    public static void main(String[] args) {
       Person person = new Person("Антон",20);
        System.out.println(person.getName());
        System.out.println((person.getAge()));
    }
    static class Person{
        private String name;
        private int age;

        public void SetName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age){
            this.name=name;
            this.age=age;
            System.out.println("Меня зовут "+name+" и мне "+age+" лет");
        }

    }
}
