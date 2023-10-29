package org.example.array;

import org.example.sorting.QuickSort;

public class CheckMaxMinArray {
    public static void maxMin(int[] arr) {
        int n = arr.length;
        QuickSort.quicksort(arr);
        int[] newArr = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i = i + 2) {
            newArr[i] = arr[j--];
        }
        int k = 0;
        for (int i = 1; i < n; i = i + 2) {
            newArr[i] = arr[k++];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 5, 2, 6};
        maxMin(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
