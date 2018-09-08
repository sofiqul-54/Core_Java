
package selection;

import java.util.Scanner;

/**
 * @author Md. Sofiqul Islam
 */
public class SimpleIfDemo_79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integer : ");
        int number = input.nextInt();
        
        if (number % 5 == 0)
            System.out.println("Hi Five");
        
        if (number % 2 == 0)
            System.out.println("Hi Even");
    }
}
