
package loops;

import java.util.Scanner;

public class REpeatAdditionQuiz_160 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*10);
        int num2 = (int)(Math.random()*10);
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is" + num1 +"+"+num2+"?");
        int answer = input.nextInt();
        
        while(num1+num2!=answer){
            System.out.println("Worng answer. Try again. What is" + num1 + "+" +num2 + "?");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
