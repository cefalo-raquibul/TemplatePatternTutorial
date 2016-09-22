package com.cefalo;

import java.util.Arrays;


public class Main
{

    public static void main(String[] args)
    {
        // write your code here

        int[] input1 = new int[]{4, 2, 2, 1, 5, 0, -33, 99, 6, 7};
        SortTemplate mergeSort = new MergeSort();
        mergeSort.sort(input1, 0, input1.length - 1);
        System.out.println("Merge: " + Arrays.toString(input1));


        int[] input2 = new int[]{98, 6, -4, -5, -5, 3, 2, 49, 100, 99, 23};
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(input2,0, input2.length-1);
//        System.out.println("Quick: "+Arrays.toString(input2));

        SortTemplate quickSortTemplate = new QuickSort();
        quickSortTemplate.sort(input2, 0, input2.length - 1);
        System.out.println("Quick: " + Arrays.toString(input2));
    }
}
