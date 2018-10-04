package com.sofiqul.generics;

import java.util.ArrayList;
import java.util.List;

public class BasicGenerics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(15000));
        list.add(new String("ABC"));
        list.add(12);
        list.add("BCD");
        list.forEach(System.out::println);
        list.forEach((o) -> {
            System.out.println(o);
        });
    }

}
