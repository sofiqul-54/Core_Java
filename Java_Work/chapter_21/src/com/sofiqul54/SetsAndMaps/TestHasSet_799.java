package com.sofiqul54.SetsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class TestHasSet_799 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("BD");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Bejjing");
        set.add("New York");
        
        System.out.println(set);
        for(String s : set){
            System.out.println(s.toLowerCase()+" ");
        }

System.out.println("/////////////////////////////////////////");

Set<String> set1 = new HashSet<>();
        set1.add("BD");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Bejjing");
        set1.add("New York");
        
        System.out.println(set1);
        for(String s1 : set1){
            System.out.println(s1.toUpperCase()+" ");
        }

    }

}
