
package Method;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente Num1");
        int n1 = sc.nextInt();
        System.out.println("Ente Num2");
        int n2 = sc.nextInt();
        
        System.out.println(""+makeSum(n1, n2, "-"
                + ""));
        
    }public static int makeSum(int n1, int n2, String str){
    int rs = 0;
        if (str == "+") {
            rs = n1 + n2;
        } else if (str == "-") {
            rs = n1 - n2;
        } else if (str == "*") {
            rs = n1 * n2;
        } else if (str == "/") {
            rs = n1 / n2;
        } else if (str == "%") {
            rs = n1 % n2;
        }

        return rs;
    }
}
