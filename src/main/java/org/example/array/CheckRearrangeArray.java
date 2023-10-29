package org.example.array;

public class CheckRearrangeArray {

    public static int[] reArrangeArray(int[] arr){
        int negativePosition = 0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp = arr[negativePosition];
                arr[negativePosition++]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,6,-4,-5};
        for(int j:reArrangeArray(arr)){
            System.out.print(j+" ");
        }
    }
}
