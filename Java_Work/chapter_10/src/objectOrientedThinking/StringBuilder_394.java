package objectOrientedThinking;

public class StringBuilder_394 {

    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        sc.append("Welcome");
        sc.append(" ");
        sc.append("to");
        sc.append(" ");
        sc.append("Java.");
        
        System.out.println(sc);
        

        
        System.out.println(sc.replace(12, 25, "CSS"));
        System.out.println(sc.delete(8, 11));
        System.out.println(sc.deleteCharAt(8));
        System.out.println(sc.reverse());
        sc.setCharAt(1, 'T');
        System.out.println(sc);
        
        
    }
}
