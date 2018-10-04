package evidence_final_1st_Try;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        getFactorials(sc.nextInt());
    }
    
    static void getFactorials(int num){
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            f=f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num +" Factorial is "+ f);
    }
}
