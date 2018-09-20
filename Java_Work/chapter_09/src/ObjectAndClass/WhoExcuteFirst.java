
package ObjectAndClass;
public class WhoExcuteFirst {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    
    static {
        System.out.println("Static");
    }

    public WhoExcuteFirst() {
        
        System.out.println("Constant");
    }
    
    
}
