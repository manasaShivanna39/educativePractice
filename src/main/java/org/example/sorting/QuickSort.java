package org.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-2, -9, 42, 21, 66, 7, 8, 1, 0, 2};
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];//pivot=2
        int i = l - 1;//i=-1
        for (int j = l; j < h; j++) {//j=0;j<10;j++         i=1,j=2                 i=1,j=7
            if (arr[j] <= pivot) {//-2<=2       arr[1]=-9   arr[2]<=pivot=f         arr[7]=1<2
                i++;                //i=0       i=1         next for loop iter      i++=2
                int temp = arr[i];  //temp= -2  temp=-9     i=1,j=3 21>2            temp=
                arr[i] = arr[j];    //arr[0]=-2 arr[1]=-9   i=1,j=4 66>2
                arr[j] = temp;      //arr[0]=-2 arr[1]=-9   i=1,j=5 7>2| i=1,j=6 8>2
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    public static void quicksort(int[] arr, int l, int h) {
        if (h > l) {
            int p = partition(arr, l, h);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, h);
        }
    }
}
