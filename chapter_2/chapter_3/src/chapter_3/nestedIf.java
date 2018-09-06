
package chapter_3;

import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lucky Number between 500 and 1000");
        int num = sc.nextInt();
        
        if (num%2 == 0){
        num+= 150;
        if (num % 5>2){
        num += 200;
        }else{
        num-=200;
        }
        }else{
        num-=500;
        num+=200;
        if(num % 3<2){
        num+=500;
        }
        }
        System.out.println("Total Score: "+ num);
    }
}
