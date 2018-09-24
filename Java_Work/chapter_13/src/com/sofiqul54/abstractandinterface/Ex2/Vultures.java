package com.sofiqul54.abstractandinterface.Ex2;

public class Vultures implements Animal {

    @Override
    public String eat() {
        return "Vultures: Vultures Eat Any Meat";
    }

    @Override
    public void hur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
