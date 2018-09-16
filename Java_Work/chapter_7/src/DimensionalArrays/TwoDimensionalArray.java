package DimensionalArrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        //   int x[] = {2, 3, 5};
        //  int y[] = {7, 8, 9};
        int twoD[][] = {
            {2, 3, 5, 6},
                {7, 8, 9},
                {1, 4, 7, 9}
            
            
            /*  {0},
            {0, 0},
            {0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0},
            {0, 0},
            {0},*/
        };
        
        System.out.println("twoD : " +twoD[1][0]);
        
        for (int oneD[] : twoD) {
            for (int i : oneD) {
                System.out.print(i + "");
            }
            System.out.println();
        }
        System.out.println("===================");
        int twoD2[][] = {
            {4, 7, 8, 9},
            {3, 4, 7, 1},
            {9, 2, 5, 6}
        };
        for (int oneD[] : twoD2){
        for(int j : oneD ){
            System.out.print(j + " ");
        }
            System.out.println("");
        }
         System.out.println("===================");
        String [][] str2D ={
            {"A", "B", "C", "D"},
            {"E", "F", "g"}
        };
        for (String oneD[] : str2D){
        for(String j : oneD ){
            System.out.print(j + " ");
        }
            System.out.println("");
        }

    }
}
