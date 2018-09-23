package DimensionalArrays;

public class ThreeDimensional {

    public static void main(String[] args) {

        //   int x[] = {2, 3, 5};
        //  int y[] = {7, 8, 9};
        int x[][] = {
            {2, 3, 5, 6},
            {7, 8, 9},
            {1, 4, 7, 9}

        };

        int y[][] = {
            {2, 3},
            {4, 7, 8, 9}
        };

        int[][][] threeD = {
            {
                {2, 3, 5, 6},
                {7, 8, 9},
                {1, 4, 7, 9}
            },
            {
                {2, 3},
                {4, 7, 8, 9}
            },};
        for (int twoD[][] : threeD) {
            for (int oneD[] : twoD) {
                for (int i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
