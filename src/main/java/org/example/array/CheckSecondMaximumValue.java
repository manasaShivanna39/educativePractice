package org.example.array;

public class CheckSecondMaximumValue {
    public static int findSecondMaximumValue(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax=max;
                max = j;
            } else if (j > secondMax && j < max) {
                secondMax = j;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(findSecondMaximumValue(arr));
    }

}
