
package com.sofiqul54.inheritance.Ex3;
public class B extends A{
    @Override
    public void sayHello(){
        System.out.println("Hi, Azad I am from A class");
    }
    
    public void sayHi(){
        super.sayHello();
        System.out.println("Hi, mostafiz I am from B class");
    }
}
