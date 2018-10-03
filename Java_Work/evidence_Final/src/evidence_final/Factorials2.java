
package evidence_final;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorials2 {
    public static void main(String[] args) {
        System.out.println("Num");
        Scanner sc = new Scanner(System.in);
        isFact(sc.nextInt());
    }
    
    static  void isFact(int num){
        BigInteger f=BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            f =f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
 
}
