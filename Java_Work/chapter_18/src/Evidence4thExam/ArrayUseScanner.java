package Evidence4thExam;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

public class ArrayUseScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        Integer[] arr = new Integer[arraySize];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        ////////////////////////////////////////////////////////////////
        System.out.println("===========================");

        Arrays.sort(arr);
        for (int j : arr) {
            System.out.println(j + " ");
        }
        ////////////////////////////////////////////////////////////////
        System.out.println("===========================");

        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        //////////////////////////USE ReVERSe //////////////////////////////////////
        System.out.println("===========================");
        
        
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

    }
}
