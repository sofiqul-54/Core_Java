
package mathFunction;
public class ComparingStrings_133 {
    public static void main(String[] args) {
        String str1 = "BanglAdesh";
        String str2="Bangladesh";
        if (str1==str2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
       /////////////////WAY-2
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        //////////////////////compare to
       String s1 = "a";
       String s2 = "a";
    if(s1.compareTo(str2)<0){
        System.out.println("Less Than 0");
    }else if(s1.compareTo(str2)>0){
        System.out.println("Greater Than 0");
    }else if(s1.compareTo(str2)==0){
        System.out.println("Equal to 0");}
    
    }
  
}
