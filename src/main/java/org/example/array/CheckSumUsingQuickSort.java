package org.example.array;

import org.example.sorting.QuickSort;

public class CheckSumUsingQuickSort {

    static int[] findSum(int[] arr, int n){
        QuickSort.quicksort(arr,0,arr.length-1);
        int partition1=0,partition2=arr.length-1;
        while(partition1!=partition2){
            int sum = arr[partition1]+arr[partition2];
            if(sum>n){
                partition2--;
            }else if(sum<n){
                partition1++;
            }else{
                return new int[]{arr[partition1],arr[partition2]};
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        for (int i : findSum(arr, value)) {
            System.out.println(i + " ");
        }
    }
}
