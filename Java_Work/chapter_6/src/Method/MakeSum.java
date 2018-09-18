package Method;

import java.util.Scanner;

public class MakeSum {

    public static void main(String[] args) {
      //  System.out.println(""+MakeSum(0, 0));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int fn = sc.nextInt();
        System.out.println("Enter The Last Number");
        int ln = sc.nextInt();
        System.out.println(MakeSum(ln, ln));
    }


    public static int MakeSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i >= n2; i--) {
                    sum+=i;
                }
            } else if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    sum+=i;
                }
            } else if (n1 == n2) {
                sum = n1;
            } else {
                sum = -1;
            }
        }
        return sum;
    }
}
