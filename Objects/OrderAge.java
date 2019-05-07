package com.company.ClassAndObject.OrderByAge;

public class OrderAge {
    private String name;
    private String ID;
    private int age;


    public OrderAge(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",getName(),getID(),getAge());
    }
}
