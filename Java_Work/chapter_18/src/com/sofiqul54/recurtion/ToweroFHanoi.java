package com.sofiqul54.recurtion;

import java.util.Scanner;

public class ToweroFHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Disk :");
        int n = sc.nextInt();

        System.out.println("The Moves Are :");
        moveDisk(n, 'A', 'B', 'C');
    }

    public static void moveDisk(int n, char fromTower, char toTower,
            char auxTower) {
        if (n == 1) {
            System.out.println("Move Disk " + n + " from " + fromTower + " to " 
                    + toTower);
        } else {
            moveDisk(n - 1, fromTower, toTower, auxTower);
            System.out.println("Move Disk " + n + " from " + fromTower + " to " 
                    + toTower);
            moveDisk(n - 1, fromTower, toTower, auxTower);
        }

    }
}
