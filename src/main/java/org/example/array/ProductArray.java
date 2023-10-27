package org.example.array;

//Array of all products except element itself
public class ProductArray {

    public static int[] findProduct(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        //Original array = {-1, 2, -3, 4, -5}
        //multiply products to left arr = {1,-1,-2,6,24}
        int temp=1;
        for(int i=0;i<n;i++){
            result[i]=temp;
            temp = temp*arr[i];
        }

        //multiply products to right arr = {120,-60,40,-30,24}
         temp =1;
        for(int i=n-1;i>=0;i--){
            result[i] = result[i]*temp;
            temp = temp*arr[i];
        }
        return result;
    }

    public static String arrayToString(int arr[]) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -5};

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }

}
