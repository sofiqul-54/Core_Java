package com.sofiqul54.evidence;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinFrom {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        displayArrays();
    }
        static void displayArrays(int... n) {
        System.out.println(Arrays.toString(n));
    }
}
