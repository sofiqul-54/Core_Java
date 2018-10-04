
package evidence_final;

public class TwoDimentionSumArr {
    public static void main(String[] args) {
        int [][] arr = {
            {2, 3, 4},
            {5, 6, 7}
        };
        int sum = 0;
        for(int[] oned :arr){
        for(int i : oned){
            System.out.println(i+" ");
            sum+=i;
        }
            System.out.println();
        }
        System.out.println(sum);
    }
}
