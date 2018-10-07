package com.sofiqul54.SetsAndMaps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet_803 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San francisco");
        set.add("Beijing");
        set.add("New York");
        System.out.println("Print Set :" + set);
        
        System.out.println("======================================");
        
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("Sorted Tree Set : " + treeSet);
        
        System.out.println("======================================");
        System.out.println("first() : "+ treeSet.first());
        System.out.println("last() : " + treeSet.last());
        System.out.println("headSet() :" + treeSet.headSet("New York"));
        System.out.println("tailSet() : "+treeSet.tailSet("London"));
        
        
        System.out.println("Lower(\"p\"):"+ treeSet.lower("L"));
        System.out.println("Higher :" + treeSet.higher("P"));
        System.out.println("Floor : " + treeSet.floor("L"));
        System.out.println("ceilling: "+ treeSet.ceiling("L"));
        System.out.println("pollFirst : " + treeSet.pollFirst());
        System.out.println("pollLast : " + treeSet.pollLast());
        System.out.println("Tree Set : " + treeSet);
        
    }
}
