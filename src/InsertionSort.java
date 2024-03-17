import java.util.Arrays;

public class InsertionSort {
    // sorts the given list using insertion sort method
    public static void insertionSort(int[] list){
        for(int i=1; i<list.length; i++){
            // the number whose index is sought
            int num = list[i];

            int j = i-1;
            while (j>=0 && list[j]>num){ // main operation = list[j]>num
                list[j+1] = list[j];
                j--;
            }
            // right index assignment
            list[j+1] = num;
        }

        // Time Complexity: O(n^2) - worst and average case
        // Time Complexity: O(n) - best case

    }

    public static void main(String[] args) {
        // for testing
        int[] testList = {17, 2, 14, 33, 11, 19};
        System.out.println("List: " + Arrays.toString(testList));
        // non-static case
        // InsertionSort obj1 = new InsertionSort();
        // obj1.insertionSort(testList);
        insertionSort(testList);
        System.out.println("Sorted List: " + Arrays.toString(testList));


    }
}
