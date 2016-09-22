package com.cefalo;

/**
 * Created by Raquibul on 9/22/2016.
 */
public class MergeSort extends SortTemplate
{


    @Override
    int divide(int[] data, int low, int high)
    {
        return (low + high) / 2;
    }


    @Override
    void merge(int[] data, int low, int middle, int high)
    {
        int[] lowHalf = new int[middle - low + 1];
        int[] highHalf = new int[high - middle];

        int q = low;
        int i = 0, j = 0;
        for (i = 0; q <= middle; q++, i++) {
            lowHalf[i] = data[q];
        }

        for (j = 0; q <= high; q++, j++) {
            highHalf[j] = data[q];
        }


        q = low;
        i = 0;
        j = 0;

        while (i < (middle - low + 1) && j < (high - middle)) {
            if (lowHalf[i] < highHalf[j]) {
                data[q] = lowHalf[i];
                i++;
            }
            else {
                data[q] = highHalf[j];
                j++;
            }
            q++;
        }

        while (i <= (middle - low)) {
            data[q] = lowHalf[i];
            i++;
            q++;
        }

        while (j < (high - middle)) {
            data[q] = highHalf[j];
            j++;
            q++;
        }


    }
}
