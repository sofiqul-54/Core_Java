package com.sofiqul54.SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap_813 {
    public static void main(String[] args) {
        Map<String, Integer> hasMap = new HashMap<>();
        hasMap.put("Smith", 30);
        hasMap.put("Mostafiz", 25);
        hasMap.put("Azad", 28);
        hasMap.put("Mortuza", 27);
        System.out.println("Display entries in HasMap");
        System.out.println(hasMap+"\n");
        
        Map<String, Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println(treeMap);
        
        Map<String, Integer> treeMap1 = new LinkedHashMap<>(hasMap);
        System.out.println(treeMap1);
        
        
    }
}
