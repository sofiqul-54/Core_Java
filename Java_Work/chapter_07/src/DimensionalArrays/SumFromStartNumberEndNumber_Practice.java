
package DimensionalArrays;

import java.util.Scanner;

public class SumFromStartNumberEndNumber_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        if(start<end)
            for(int i = start; i <= end; i++)
            System.out.print(i + " ");

    else if(start > end)
        for(int i = start; i >= end; i--)
            System.out.print(i + " "); 
        
    }
}
