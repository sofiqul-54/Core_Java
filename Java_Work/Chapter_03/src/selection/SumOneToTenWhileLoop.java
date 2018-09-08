
package selection;
public class SumOneToTenWhileLoop {
    public static void main(String[] args) {

        int sum = 0, i = 1;
        while(i<500){
        sum = sum+i;
        i++;
        }
        System.out.println("Sum is " + sum);
    }
}
