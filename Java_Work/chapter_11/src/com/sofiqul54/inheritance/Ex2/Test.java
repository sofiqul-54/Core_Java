
package com.sofiqul54.inheritance.Ex2;

public class Test {
    public static void main(String[] args) {
        B b1 = new B(); // b is an Object and ist reference B class.
        A b2 = new B();
        A a1 = new A();
        
      //  B a2 = new A(); // wrong child cannot be referance of parents class
      
      C c1 = new C();//
      B c2 = new C();// Polymorphism, inheritance & Object is Java's fiture;
      A c3 = new C();//
        System.out.println(b1 instanceof B);
        System.out.println(b2 instanceof A);
        System.out.println(a1 instanceof A);
        System.out.println(c1 instanceof C);
        System.out.println(c2 instanceof C);
        System.out.println(c3 instanceof C);
    }
}
