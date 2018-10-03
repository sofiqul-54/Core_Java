
package evidence_final_1st_Try;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        isOddEven(sc.nextInt());
        
    }
  static void isOddEven(int num){
  if (num == 0){
      System.out.println(num +"  is Zero");
  }else{
  if(num %2==0){
      System.out.println(num +" is Even Number");
  }else{
      System.out.println(num +" is Odd Number");
  }
  }
  }
}
