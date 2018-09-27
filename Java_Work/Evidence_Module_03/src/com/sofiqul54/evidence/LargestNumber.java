package com.sofiqul54.evidence;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isLargeNumber(sc.nextInt(),sc.nextInt(),sc.nextInt());

    }

    static void isLargeNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " is Largest Number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest Number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is Largset Number");
        } else {
            System.out.println(n1 + "," + n2 + "," + n3);
        }
    }
}
