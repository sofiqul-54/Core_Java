package com.sofiqul54.abstractandinterface.Ex2;

public class Test {

    public static void main(String[] args) {
       Vultures vultures = new Vultures();
       vultures.eat();
       Monkey monkey = new Monkey();
       monkey.eat();
        System.out.println(monkey.eat());
        System.out.println(vultures.eat());
        
        Object[] obj = {new Vultures(), new Monkey()};
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof Animal) {
                System.out.println(((Animal) obj[i]).eat());
            }
        }

    }
}
