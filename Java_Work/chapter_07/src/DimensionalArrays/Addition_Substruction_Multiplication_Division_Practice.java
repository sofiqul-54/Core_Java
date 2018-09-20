package DimensionalArrays;

import java.util.Scanner;

public class Addition_Substruction_Multiplication_Division_Practice {

    public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float devide;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Numbers :");
        first = sc.nextInt();
        second = sc.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;

        System.out.println("Sum :" + add);
        System.out.println("Difference : " + subtract);
        System.out.println("Multiplication :" + multiply);
        System.out.println("Division :" + devide);
    }

}
