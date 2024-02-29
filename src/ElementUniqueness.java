public class ElementUniqueness {

    // returns a bool expressing depending on whether
    // given list contain elements which have same value
    public static boolean isUnique(int[] array){

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]) return false;
            }
        }
        return true;

        // Time complexity : O(n^2)
    }

    public static void main(String[] args) {

        // sample list
        int[] list1 = {13, 17, 789, -2, -31, 0, 442, 1};
        int[] list2 = {13, 17, 789, -2, -31, 0, 442, 442};

        System.out.println(isUnique(list1)); // true
        System.out.println(isUnique(list2)); // false

    }
}
