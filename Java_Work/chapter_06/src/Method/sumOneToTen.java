package Method;

public class sumOneToTen {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            counter++;
            sum += i;
            System.out.println("Number sum is " + sum);
        }
        System.out.println("total sum " + sum);
       
      ///////////////////////////////////////////////////////////  
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
