package org.example.array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5};
        int[] arr2 = {2,6,7,8};
        for (int i : mergeArrays(arr1, arr2)) {
            System.out.println(i+",");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] mergedArray = new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArray[k++]=arr1[i++];
            }else{
                mergedArray[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            mergedArray[k++]=arr1[i++];
        }
        while(j<arr2.length){
            mergedArray[k++]=arr2[j++];
        }
        return mergedArray;
    }
}
