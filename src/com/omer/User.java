package com.omer;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    //method
    public void sayHello(){
        System.out.println("hello "+name);
    }

}
