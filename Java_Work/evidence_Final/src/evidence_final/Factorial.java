
package evidence_final;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        isFactorial(sc.nextInt());
    }
    static  void isFactorial(int num){
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial is "+f);
    }
  
}
