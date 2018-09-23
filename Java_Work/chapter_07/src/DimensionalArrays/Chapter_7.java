package DimensionalArrays;

public class Chapter_7 {

    public static void main(String[] args) {
        int[] x = new int[2];
        x[0] = 10;
        x[1] = 25;
        System.out.println("x[0] :" + x[0]);
        System.out.println("x[1] :" + x[1]);

        //System.out.println("x[2] :" +x[2]);
        for (int i : x) {
            System.out.println(i);
        }

        int p[] = {10, 25, 35, 23, 14, 32, 5, 1}; // Array length 8 && Index 0-7
        System.out.println("Length " + p.length);
        //System.out.println(p);// Worng way
        System.out.println("p[5] :" + p[5]);
        //for (int j : p) {
       //     System.out.print(j+",");
            
           // p = new int [9]; If we run this the answare is be 0(zero)
            for (int j :p){
                System.out.println(j);
            }
       // }
    }
}
