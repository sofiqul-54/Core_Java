package Method;

public class MethodEx3 {

    public static void main(String[] args) {
        display();
        MethodEx3 m = new MethodEx3();
        m.display2();
        

        // call static method way - 2
        MethodEx3.display();
    }

    public static void display() {
        System.out.println("I am void Type");
    }
    
    public  void display2(){
    
        System.out.println("I am void Type");
    }
}
