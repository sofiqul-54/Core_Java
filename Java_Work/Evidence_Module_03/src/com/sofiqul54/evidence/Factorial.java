package com.sofiqul54.evidence;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
    static void getFactorials(int n) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));// f= f * i
        }
        System.out.println(f);
    }
}
