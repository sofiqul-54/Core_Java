
package objectOrientedThinking;
public class Palindom {
    public static void main(String[] args) {
        System.out.println(isPalindom("mom"));
    }
    
   public static boolean isPalindom(String s){
       StringBuilder str = new StringBuilder(s);
       boolean status = false;
       if(str.reverse().equals(s)){
           status = true;
       }
       return status;
   }
}
