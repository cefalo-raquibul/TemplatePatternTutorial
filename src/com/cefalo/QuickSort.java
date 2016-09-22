package com.cefalo;

/**
 * Created by Raquibul on 9/22/2016.
 */
public class QuickSort extends SortTemplate
{

    @Override
    int divide(int[] data, int low, int high)
    {
        int q = low;
        int j = low;
        for (j = low; j < high; j++) {
            if (data[j] <= data[high]) {
                swap(data, j, q);
                q++;
            }
        }
        swap(data, high, q);
        return q - 1;
    }


    @Override
    void merge(int[] data, int low, int middle, int high)
    {
        //do nothing
    }


    private void swap(int[] data, int first, int second)
    {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

}
