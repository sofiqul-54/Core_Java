/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

import java.util.Scanner;

/**
 *
 * @author Md. Sofiqul Islam
 */
public class AdditionQuiz_77 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() %10);
        int number2 = (int)(System.currentTimeMillis()/7 %10);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is " + number1 + "+" + number2 + "?");
        
        int number = input.nextInt();
        
        System.out.println(number1 + "+" + number2 + "=" + answer + "is" + number1+number2 == answer);
    }
    
}
