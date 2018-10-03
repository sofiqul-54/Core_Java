
package evidence_final;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Password :");
        
        String password = sc.nextLine();
        if(password.length()>=7){
            System.out.println("Password Is Valid");
        }else{
            System.out.println("Password is Invalid");
        }
    }
}
