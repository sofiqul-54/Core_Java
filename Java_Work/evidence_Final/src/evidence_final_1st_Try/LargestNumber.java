package evidence_final_1st_Try;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println("Enter Numbers : ");
        Scanner sc = new Scanner(System.in);
        IsLargestNumber(sc.nextInt(), sc.nextInt(), sc.nextInt());
    }

    static void IsLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the Largest Number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the Largest Number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 +" is the Largest Number");
        }else{
            System.out.println(n1 +","+n2+","+n3 +" are all equal Numbers");
        }
    }
}
