package com.sofiqul54.SetsAndMaps;

import java.util.*;

public class SetListPerformenceTest_807 {

    static final int N = 50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(i);
            Collections.shuffle(list);
            
            Collection<Integer>set1 = new HashSet<>();
           // System.out.println("Member test time for hash set is : " + getTestTime(set1)+"");
        }
    }
}
