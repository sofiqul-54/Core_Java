
package Home_Work;

import java.util.Scanner;

public class NumericTypeConversion_57 {
    public static void main(String[] args) {
      /*  System.out.println((int)1.7);
        
        System.out.println(1/2);*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enbter  Puyrchase Amount");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales Tax is : " + (int)(tax * 100)/100.0);
    }
 
}
