package org.example.array;

public class CheckMinimum {

    public static int findMinimum(int[] arr){
        if(arr.length==0) {
            return 0;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,7,9};
        System.out.println(findMinimum(arr));
    }
}
