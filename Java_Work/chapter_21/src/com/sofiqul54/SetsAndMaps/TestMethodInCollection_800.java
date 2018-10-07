package com.sofiqul54.SetsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class TestMethodInCollection_800 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Bejjing");

        System.out.println("1. Set1 is " + set1);
        System.out.println( "2. elements in set1 " +set1.size());

        set1.remove("London");
        System.out.println("\n3. After remove set1 is " + set1);
        System.out.println("4. elements in set1 " +set1.size());

        Set<String> set2 = new HashSet<>();

        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.println("\n5. set2 is " + set2);
        System.out.println("6. elements in set2 " +set2.size());
        System.out.println("\n7. Is Taipei in set2 " + set2.contains(" Taipei "));

        set1.addAll(set2);
        System.out.println("\n8. After adding set2 to set1, set1 is " + set1);

        set1.removeAll(set2);
        System.out.println("\n9. After removing set2 from set1, set1 is " + set1);

        set1.retainAll(set2);
        System.out.println("\n10. After removing common elements in set2 "
                + "from set1, set is " + set1);

    }
}
