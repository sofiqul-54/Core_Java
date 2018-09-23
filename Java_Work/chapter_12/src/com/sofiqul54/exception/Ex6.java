
package com.sofiqul54.exception;

public class Ex6 {
     public static void main(String[] args) {
        System.out.println("111111111111");
        try {
            System.out.println(10/2);
            System.out.println(Integer.parseInt("TEN"));
        } catch (ArithmeticException | NumberFormatException pop) {
          // ne.printStackTrace();
            System.out.println("Wow ki erro");
        }
        
        System.out.println("33333333333333333333");
        
    }
}
