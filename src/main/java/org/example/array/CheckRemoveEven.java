package org.example.array;

public class CheckRemoveEven {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : removeEven(arr)) {
            System.out.println(i + ",");
        }
    }

    public static int[] removeEven(int[] arr) {

        int arraySize = 0;
        for (int k : arr) {
            if (k % 2 != 0) {
                arraySize++;
            }
        }
        int j = 0;
        int[] newArr = new int[arraySize];
        for (int k : arr) {
            if (k % 2 != 0) {
                newArr[j++] = k;
            }
        }

        return newArr;
    }
}
