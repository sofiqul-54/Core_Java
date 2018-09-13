package Method;

public class MethodEX3 {

    public static void main(String[] args) {
        display();
        MethodEX3 m = new MethodEX3();
        m.display2();
        

        // call static method way - 2
        MethodEX3.display();
    }

    public static void display() {
        System.out.println("I am void Type");
    }
    
    public  void display2(){
    
        System.out.println("I am void Type");
    }
}
