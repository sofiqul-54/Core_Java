
package DimensionalArrays;
public class SingleDimensionalArray {
    public static void main(String[] args) {
        int p[] = {10, 25, 35, 23, 14, 44, 91};
        System.out.println("Length :" +p.length);
        System.out.println("index 5"+p[5]);
        for (int j : p){
            System.out.print(j+",");
         
        }
        int q[] = {40, 55, 58, 61, 53, 73};
        for(int j : q){
            System.out.print(j +" ");
        }
   
    }
}
