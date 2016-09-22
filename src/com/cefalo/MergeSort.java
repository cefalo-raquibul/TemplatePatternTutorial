package com.cefalo;

import java.util.Arrays;


/**
 * Created by Raquibul on 9/22/2016.
 */
public class MergeSort
{

    void sort(int[] data, int low, int high){
        if(low < high){
            int middle = (low+high)/2;
            sort(data, low, middle);
            sort(data, middle+1, high);
            merge(data, low, middle, high);
        }
    }

    void merge(int[] data, int low, int middle, int high){
        int[] lowHalf = new int[middle - low+1];
        int[] highHalf = new int[high - middle];

        int q = low;
        int i=0,j=0;
        for(i=0;q<=middle;q++,i++){
            lowHalf[i] = data[q];
        }

        for(j=0;q<=high;q++,j++){
            highHalf[j] = data[q];
        }

        System.out.println(Arrays.toString(lowHalf));
        System.out.println(Arrays.toString(highHalf));

        q = low;
        i = 0 ;
        j = 0;

        while (i<(middle-low+1) && j < (high-middle) ){
            if(lowHalf[i] < highHalf[j]){
                data[q] = lowHalf[i];
                i++;
            }else{
                data[q] = highHalf[j];
                j++;
            }
            q++;
        }

        while (i<= (middle-low)){
            data[q] = lowHalf[i];
            i++;
            q++;
        }

        while (j< (high-middle)){
            data[q] = highHalf[j];
            j++;
            q++;
        }

        System.out.println(Arrays.toString(data));


    }
}
