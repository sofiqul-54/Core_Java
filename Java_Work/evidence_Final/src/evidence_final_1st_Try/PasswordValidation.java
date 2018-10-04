
package evidence_final_1st_Try;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Password :");
        String pass = sc.nextLine();
        if(pass.length()>=7){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
