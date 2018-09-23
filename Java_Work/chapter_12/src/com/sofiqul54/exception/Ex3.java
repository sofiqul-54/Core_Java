package com.sofiqul54.exception;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("111111111111");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("You can not Dive by zero");
        }
        System.out.println("2222222222222222");
        try {
            System.out.println(Integer.parseInt("TEN"));
        } catch (Exception e) {
            System.out.println("You can not parse Ten, Five etc");
        }
        System.out.println("33333333333333333333");
        
    }
}
