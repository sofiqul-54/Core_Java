package Evidence4thExam;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        System.out.println("============================");
        System.out.println("Print Arrays");
        int[] arr = {4, 2, 1, 8, 6, 9};

        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println("============================");

        System.out.println("Sorter Array or Assending Order");
        int[] a = {4, 2, 1, 8, 6, 9};
        Arrays.sort(a);
        for (int j : a) {
            System.out.println(j + " ");
        }
        System.out.println("============================");

        System.out.println("Arrays decending Order");
        int[] b = {4, 2, 1, 8, 6, 9};
        Arrays.sort(b);
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i] + " ");
        }

    }
}
