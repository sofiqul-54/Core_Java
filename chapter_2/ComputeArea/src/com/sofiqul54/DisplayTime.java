
package com.sofiqul54;

import java.util.Scanner;

/**
 *
 * @author MD. Sofiqul Islam
 * @version v.1.0.0
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt the user for input
        System.out.print("Enter an integer for second :");
        int seconds = input.nextInt();
        
        int minutes = seconds / 60;
        int remaningSeconds = seconds % 60;
        System.out.println(seconds + "  second is " + minutes + "  munites and "+ remaningSeconds+ " seconds");
    }
}
