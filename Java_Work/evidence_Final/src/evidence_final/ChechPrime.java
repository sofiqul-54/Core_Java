package evidence_final;

import java.math.BigInteger;
import java.util.Scanner;

public class ChechPrime {

    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        isPrime(sc.nextInt());
    }

    static void isPrime(int num) {
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println(num + "is Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
