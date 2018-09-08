package selection;

import java.util.Scanner;

public class TurnaryEvenOdd_103 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = sc.nextInt();
        System.out.println((num % 2 == 0) ? "Number is Even" : "Number is Odd");
    }
}
