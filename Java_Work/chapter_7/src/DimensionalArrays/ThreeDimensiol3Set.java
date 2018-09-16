package DimensionalArrays;

public class ThreeDimensiol3Set {

    public static void main(String[] args) {

        String x[][] = {
            {"A", "B", "C", "D"},
            {"E", "F", "G"},
            {"H", "I", "J", "K"}

        };

        String y[][] = {
            {"L", "M"},
            {"N", "O", "P", "Q"}
        };

        String z[][] = {
            {"R", "S", "T"},
            {"U", "V", "W", "X", "Y", "Z"}
        };

        String[][][] threeD = {
            {
                {"A", "B", "C", "D"},
                {"E", "F", "G"},
                {"H", "I", "J", "K"}
            },
            {
                {"L", "M"},
                {"N", "O", "P", "Q"}
            },
            {
            {"R", "S", "T"},
            {"U", "V", "W", "X", "Y", "Z"}
            },
        };
        for (String twoD[][] : threeD) {
            for (String oneD[] : twoD) {
                for (String i : oneD) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
