package com.sofiqul54.bearingchiti;

public class Ex2 {

    public static void main(String[] args) {
        try {
            System.out.println(getDivition(10, 0));
        }catch (Exception e){
            System.out.println("you can not divide by 0");
        }
        //System.out.println(getDivition(10, 0));
        System.out.println("hellooooooooooooo");
        System.out.println(getParseString("TEN"));
    }
    //bearing chiti style

    public static int getDivition(int x, int y) throws ArithmeticException {
        int rs = x / y;
        return rs;
    }
    
    public static int getParseString(String str){
        int rs = 0;
        try {
            Integer.parseInt(str) ;
        } catch (Exception e) {
            System.out.println("You can not Parse String Like Ten, FIve etc");
      
        }
       
        return rs;
    }
}
