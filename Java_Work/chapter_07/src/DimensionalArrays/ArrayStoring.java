package DimensionalArrays;

import java.util.Arrays;

public class ArrayStoring {

    public static void main(String[] args) {
        int[] x = {8, 9, 4, 1, 6, 7, 5, 11, 48, 21, 49};
        Arrays.sort(x);
        ArrayAsmetodArguments.displayArray(x);
        
       
        for (int i : x){
            System.out.print(i +" ");
        }
    }

}
