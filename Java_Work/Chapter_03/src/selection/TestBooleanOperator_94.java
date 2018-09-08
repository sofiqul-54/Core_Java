
package selection;

import java.util.Scanner;

/**
 *
 * @author d. sofiqul Islam
 */
public class TestBooleanOperator_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        
        if (num % 2 == 0 && num % 3 == 0){
            System.out.println("Yes 1");          
        }else{
            System.out.println("No 1");
        }
        
        if (num % 2 == 0 || num % 3 == 0){
            System.out.println("Yes 2");          
        }else{
            System.out.println("No 2");
        }
        
        if (num % 2 == 0 ^ num % 3 == 0){
            System.out.println("Yes 3");          
        }else{
            System.out.println("No 3");
        }
    }
}
