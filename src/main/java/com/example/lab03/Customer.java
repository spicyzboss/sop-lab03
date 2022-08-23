package com.example.lab03;

public class Customer {
    private String ID;
    private String name;
    private String sex;
    private int age;

    public Customer() {
        this("", null, "female", 0);
    }

    public Customer(String ID, String n, String s, int a) {
        setID(ID);
        setName(n);
        setSex(s);
        setAge(a);
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
