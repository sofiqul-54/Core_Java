package com.sofiqul54.exception;

public class Ex5 {
 public static void main(String[] args) {
        System.out.println("111111111111");
        try {
            System.out.println(10/2);
            System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException ae) {
            System.out.println("You can not Dive by zero");
                System.out.println("2222222222222222");     
        } catch (NumberFormatException e) {
            System.out.println("You can not parse Ten, Five etc");
        } finally{
            System.out.println("Need client");
        }
        
        System.out.println("33333333333333333333");
        
    }
}
