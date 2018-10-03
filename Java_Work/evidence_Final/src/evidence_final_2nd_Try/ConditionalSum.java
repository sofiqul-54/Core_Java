
package evidence_final_2nd_Try;

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter number");
        do{
        n=sc.nextInt();
        sum+=n;
        }while (n!=0);
        //sum+=5;
        System.out.println(sum);
    }
 
}
  