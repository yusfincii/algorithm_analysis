// import java.util.Arrays;

import java.util.Arrays;

public class QuickSort {

    // a utility swap function
    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];

        int pIndex = left;

        for(int i=left; i<right; i++){
            if(arr[i]<= pivot){
                swap(arr, i ,pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, right);
        return pIndex;

    }

    public static int[] quickSort(int[] arr, int left, int right){
        if(left<right){
            int pIndex = partition(arr, left, right);
            quickSort(arr, left, pIndex-1);
            quickSort(arr, pIndex+1, right);
        }

        return arr;

        // Time Complexity : O(n*logn)
    }

    public static void main(String[] args) {
        /*// test for swap function
        int[] arrx = {1, 3, 5};
        swap(arrx, 0, 2);
        System.out.println(Arrays.toString(arrx));*/

        int[] testList = {1, 34, 5, 11, 88, 33, 49, 49, 77, 61, 17, 101, 90, 2};

        System.out.println(Arrays.toString(quickSort(testList, 0 ,testList.length-1)));


    }
}
