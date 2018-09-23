package com.sofiqul54.exception;

public class Test extends Animal {

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }

    public void display() {
        new IllegalAccessException();
    }

}
