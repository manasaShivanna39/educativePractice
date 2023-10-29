package org.example.array;

public class CheckFirstUnique {
    public static int findFirstUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {//1,2,3,1
            boolean isRepeated = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i!=j) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1,2};
        System.out.println(findFirstUnique(arr));
    }
}
