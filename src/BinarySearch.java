public class BinarySearch {
    // list should be sorted for binary search

    public static boolean binarySearch(int[] list, int num){
        int left = 0; // left pointer
        int right = list.length-1; // right pointer

        //
        while (left < right){
            int medium = (left + right)/2;

            // bigger half of list
            if(list[medium] < num){
                left = medium+1;
            }
            // smaller half of list
            else if(list[medium] > num){
                right = medium-1;

            }
            // found case
            // list[medium] == num
            else return true;
        }
        // not found case
        return false;

        // Time Complexity : O(log(n)) - average and worst case
    }

    public static void main(String[] args) {
        // for testing
        int[] testList = {3, 14, 27, 29, 31, 42, 55, 70, 74, 81, 85, 93, 98};
        System.out.println(binarySearch(testList, 70)); // true
        System.out.println(binarySearch(testList, 44)); // false
    }
}
