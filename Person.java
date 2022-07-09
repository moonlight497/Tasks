package com;

import java.io.OutputStream;
import java.io.Serializable;

public class Person  implements Serializable {
    // don`t serializable String sex
    private  String name;
    private int age;
    private transient String sex;
    public Person(String name,int age,String sex){
    this.age=age;
    this.sex=sex;
    this.name=name;
}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }
    public String toString(){
        return "Моё имя "+ name+" мне "+age+" лет "+" мой пол "+sex;
    }
}
