package org.example.array;

public class CheckRotateArray {
    public static int[] rotateArray(int[] arr){
        int lastElement = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastElement;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,3,2};
        for (int j:
        rotateArray(arr)) {
            System.out.print(j+" ");
        };
    }
}
