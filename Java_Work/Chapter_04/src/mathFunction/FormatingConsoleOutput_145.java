
package mathFunction;
public class FormatingConsoleOutput_145 {
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = 0.0013;
        double interest = amount*interestRate;
        System.out.println("Interest is $ :"+interest);
        System.out.println("Interest is $ :" +(int)(interest*100)/100.0);
        System.out.printf("Interest is $ :%4.2f", +interest);
    }
}
