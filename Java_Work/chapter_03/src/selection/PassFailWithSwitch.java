
package selection;

import java.util.Scanner;

public class PassFailWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();
        int status = 0;
        if(marks <70){
        status=0;
        }else{
        status=0;
        }
        
        switch(status){
        case 0:
            System.out.println("Failed");
        break;
        case 1:
            System.out.println("Passed");
            
        }
    }
}
