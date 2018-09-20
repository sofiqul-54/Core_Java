package DimensionalArrays;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        // Arrays.sort(x);
        int newArray[] = new int[x.length];
        int j = 0;
        for (int i = x.length - 1; i >= 0; i--) {
           newArray[j] = x[i];
           j++;
        }
        for(int k : newArray){
         System.out.println(k + " ");}
    }

}
