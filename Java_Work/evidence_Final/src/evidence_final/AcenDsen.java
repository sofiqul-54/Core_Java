
package evidence_final;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AcenDsen {
    public static void main(String[] args) {
        System.out.println("Enter Array Value :");
        Scanner sc = new Scanner(System.in);
        int ArraySize = sc.nextInt();
        Integer[] arr =new Integer[ArraySize];
        for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
//        Collections.reverse(Arrays.asList(arr));
//        System.out.println(Arrays.toString(arr));
System.out.println("Min :"+arr[0] + "Max :"+arr[arr.length-1]);
    }
}
