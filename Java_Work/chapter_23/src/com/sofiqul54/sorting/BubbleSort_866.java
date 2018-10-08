package com.sofiqul54.sorting;

public class BubbleSort_866 {

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        
     //   System.out.println(list + " ");
     for(int i :bubbleSort(list)){
         System.out.print(i+ " ");}
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;

            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
        return list;
    }
}
