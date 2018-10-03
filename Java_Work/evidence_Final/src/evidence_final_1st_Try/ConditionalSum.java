
package evidence_final_1st_Try;

import java.util.Scanner;

public class ConditionalSum {
    public static void main(String[] args) {
        int sum = 0;
    Scanner sc = new Scanner(System.in);
    int n = 0;
        System.out.println("Enter a number :");
        do{
        n = sc.nextInt();
        sum+=n;
        }while (n!=-1);             
            sum+=1;
        System.out.println(sum+" ");
    }
}
