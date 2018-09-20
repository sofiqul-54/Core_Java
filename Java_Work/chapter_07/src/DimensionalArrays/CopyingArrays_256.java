
package DimensionalArrays;

import java.time.Clock;

public class CopyingArrays_256 {
    public static void main(String[] args) {
        int sourceArray[] = {2, 6, 8, 5};
        
        int targetArray[] = new int [sourceArray.length];
        for(int i=0; i< sourceArray.length; i++){
        targetArray[i] = sourceArray[i];
        }
        for (int j : targetArray){
            System.out.print(j+ " ");
        }
        
        ////////////////////////////////new arraycopy
        
        int newArray [] = new int [sourceArray.length];
        System.arraycopy(sourceArray, 0, newArray, 0, sourceArray.length);
        for (int k : newArray){
            System.out.println(k +" ");
        }
        
        System.out.print("==========================================");
        
        int s[] = {1, 3, 5, 8};
        int t [] = new int[10];
        System.arraycopy(s, 1, t, 3, 3);
        for (int p : t){
            System.out.println(p +"");
        }
        
       
    }
  
}
