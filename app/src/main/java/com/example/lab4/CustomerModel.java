package com.example.lab4;

public class CustomerModel {
    private int ID;
    private int Age;
    private String Name;
    private boolean Active;

    public CustomerModel() {
    }

    public CustomerModel(int ID, int age, String name, boolean active) {
        this.ID = ID;
        Age = age;
        Name = name;
        Active = active;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "ID=" + ID +
                ", Age=" + Age +
                ", Name='" + Name + '\'' +
                ", Active=" + Active +
                '}';
    }
}
