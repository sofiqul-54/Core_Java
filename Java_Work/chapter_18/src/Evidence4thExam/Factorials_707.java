
package Evidence4thExam;

//import java.util.Scanner;

public class Factorials_707 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a nonegetive integer");
//        int 
System.out.println(getFactorials(49));
    }
    static long getFactorials(int n){
        if (n==0)
            return 1;
        else
            return n *getFactorials(n-1);
    }
}
