/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sofiqul54.evidence.hw_02_10_2018;

import java.util.Scanner;

/**
 *
 * @author Abu Rayhan
 */
public class OddEvenNumber {
    public static void main(String args[]) {
System.out.println("Enter an integer: ");
Scanner in = new Scanner(System.in);
int x=in.nextInt();
if (x % 2 == 0) {
System.out.println("Your entered number is an even number.");
} else {
System.out.println("Your entered number is an odd number.");
}
}
}
