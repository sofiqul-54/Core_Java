package selection;

import java.util.Scanner;

public class SwitchCaseStatement_100 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Input");
        int status = sc.nextInt();
        switch (status) {
            case 0:
                System.out.println("00000000000000");
                break;

            case 1:
                System.out.println("111111111111");
                break;

            case 2:
                System.out.println("2222222222222");
                break;

            case 3:
                System.out.println("333333333333");
                break;
                
                default:
                    System.out.println("def");
                    System.exit(1);
        }
    }
}
