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
public class OddEven {

    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        isOddEven(sc.nextInt());
    }

    static void isOddEven(int num) {
        if (num == 0) {
            System.out.println(num + " is Zero");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " is Even Number");
            } else {
                System.out.println(num + " is Odd Number");
            }
        }
    }
}
