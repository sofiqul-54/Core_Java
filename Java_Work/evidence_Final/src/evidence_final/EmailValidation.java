
package evidence_final;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email :");
        
        String email = sc.nextLine();
        
        int atpos = email.indexOf("@");
        int dotpos = email.indexOf(".");
        
        if(atpos>0 && dotpos<email.length()-1 && atpos<dotpos-1){
            System.out.println("Email is Valid");
        }else{
            System.out.println("Email is Invalid");
        }
    }
}
