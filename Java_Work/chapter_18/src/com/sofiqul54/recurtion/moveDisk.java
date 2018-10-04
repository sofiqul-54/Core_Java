package com.sofiqul54.recurtion;

public class moveDisk {
    public static void main(String[] args) {
        
    }

    public static void moveDisk(int n, char fromTower, char toTower,
            char auxTower) {
        if (n == 1) {
            System.out.println("Move Disk" + n + "from"+fromTower+"to"+toTower);
        }else{
            moveDisk(n-1, fromTower, toTower, auxTower);
            System.out.println("Move Disk"+n+"from"+fromTower+"to"+toTower);
            moveDisk(n-1, fromTower, toTower, auxTower);
        }
    }
}
