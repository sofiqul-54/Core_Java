package com.sofiqul54.sorting;

public class InsertionSort_863 {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 1, 4, 6, 5, -4, 9};
        InsertionSort_863.insertionSort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "  ");
        }
    }

}
