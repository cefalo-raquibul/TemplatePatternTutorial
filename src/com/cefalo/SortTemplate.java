package com.cefalo;

/**
 * Created by Raquibul on 9/22/2016.
 */
public abstract class SortTemplate
{
    // template method
    public final void sort(int[] data, int low, int high) {
        if (low < high) {
            int q = divide(data, low, high);
            sort(data, low, q);
            sort(data, q + 1, high);
            merge(data, low, q, high);
        }
    }

    abstract int divide(int[] data, int low, int high);
    abstract void merge(int[] data, int low, int middle, int high);
}
