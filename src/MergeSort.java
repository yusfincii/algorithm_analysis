import java.util.Arrays;

public class MergeSort {
    // returns an non-decreasing ordered list of merged given two list
    public static int[] mergeSort(int[] B, int[] C){
        // will return
        int[] A = new int[B.length+C.length] ;

        // counters
        int i=0;
        int j=0;
        int k=0;

        while (i< B.length && j<C.length){
            if(B[i] <= C[j]){ // main operation
                A[k] = B[i];
                i++;
            }else{
                A[k] = C[j];
                j++;
            }
            k++;
        }

        // following if-else is the case of one of given listed used completely(the smaller one)
        // and other one's remains elements will copy to merged new list

        // when B fully copied
        if(i == B.length){
            // copy remaining elements of C if any
            for (int x=k; x<C.length+B.length; x++){
                A[x] = C[j];
                j++;
            }
        }else{
            // copy remaining elements of B if any
            for (int x=k; x<C.length+B.length; x++){
                A[x] = B[i];
                i++;
            }
        }

        return A;

        // Time Complexity : O(n*logn)
    }

    public static int[] mergeSort(int[] arr, int low, int high) {

        // when list have only 1 elements
        if (low == high) {
            int[] tList = new int[1];
            tList[0] = arr[low];

            return tList;
        }

        int mid = (low + high) / 2;

        // smaller one
        int[] sh = mergeSort(arr, low, mid);
        // bigger one
        int[] bh = mergeSort(arr, mid + 1, high);

        // when last step it uses merge sort function
        // which takes 2 list as parameter
        return mergeSort(sh, bh);
    }

    public static void main(String[] args) {
        // for testing
        int[] testList = {1, 4, 7, 11, 12, 13, 14};
        int[] testList2 = {2, 5, 6, 9, 15};
        int[] testList3 = {1, 34, 5, 11, 88, 33, 49, 49, 77, 61, 17, 101, 90, 2};

        // merge process of given two sorted list
        System.out.println(Arrays.toString(mergeSort(testList, testList2)));

        // test
        System.out.println(Arrays.toString(mergeSort(testList3, 0, testList3.length-1)));
    }
}
