/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathFunction;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConcatWith3Stribgs {

    public static void main(String[] args) {
       char ch = 'a';
        System.out.println(++ch);
        for (int i = 0; i < 26; i++) {
            System.out.println(++ch);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
       String s1 = sc.nextLine();
       String s2 = sc.nextLine();
       String s3 = sc.nextLine();
       String s4 = s1+" " + s2+" " + s3;
       // System.out.println("333 strings :" + s1.concat(s2).concat(s3));
        System.out.println("S4 :" + s4);
    }

}
