package org.example.array;

public class CheckSum {
    public static int[] findSum(int[] arr, int n) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int value = 27;
        for (int i : findSum(arr, value)) {
            System.out.println(i + " ");
        }
    }
}
