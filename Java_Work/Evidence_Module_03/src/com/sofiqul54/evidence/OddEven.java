package com.sofiqul54.evidence;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
    
    static void isOddEven(int num){
    if(num==0){
        System.out.println(num +" is Zero");
    }else
        if (num%2==0){
        System.out.println(num +"is Even number");
    }else{
        System.out.println(num+"is Odd Number");    
    }
    }
}
