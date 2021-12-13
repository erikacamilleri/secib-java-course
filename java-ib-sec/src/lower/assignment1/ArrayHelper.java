package lower.assignment1;

public class ArrayHelper {
    
    /**
     * Fill an array with the same value.
     * E.g. { , , , } -1 ==> { -1, -1, -1, -1} 
     * @param arr
     * @param value
     * @return arr
     */
    public static int[] fill(int[] arr, int value) {
        for (int i : arr) {
            arr[i] = value;
        }
        return arr;
    }

    public static int[] replace(int[] arr, int find, int replace, int fromIndex) {
        for(int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == find) {
                arr[i] = replace;
            }
        }
        return arr;
    }
    
    /**
     * Insert a value at a particular index in an array
     * E.g. {5, 6, 7} 2 0 ==> {2, 6, 7}
     * @param arr
     * @param index
     * @return arr
     */
    public static int[] insertAt(int[] arr, int value, int index) throws IndexOutOfBoundsException {
        // TODO insertAt implementation
        return arr;
    }
    
    /**
     * TODO Daniil
     * Test whether an array contains a specific value.
     * E.g. {1, 4, 6} 6 ==> true | 7 ==> false
     * @param arr
     * @param value
     * @return if value in arr ==> true else ==> false
     */
    public static boolean contains(int[] arr, int value) {
        boolean flag = false;
        // TODO contains implementation
        return flag;
    }

    /**
     * TODO Bill
     * Calculate average value of array elements.
     * E.g. {1, 2, 3} ==> 3
     * @param arr
     * @return average
     */
    public static int average(int[] arr) {
        int average = -1;
        // TODO average implementation
        return average;
    }

    /**
     * TODO Bill
     * Calculate the total sum of array elements.
     * E.g. {1, 2, 3} => 6
     * @param arr
     * @return sum
     */
    public static int sum(int[] arr) {
        int sum = -1;
        // TODO average implementation
        return sum;
    }

    /**
     * TODO Mike
     * Find the target in the array
     * E.g. {1, 5, 6, 7} 7 ==> 3, 8 ==> -1
     * @param arr
     * @return found? target index | -1
     */
    public static int find(int[] arr, int target) {
        int index = -1;
        // TODO find implementation
        return index;
    }

    /**
     * TODO Alex
     * Get the largest value in the array.
     * @param arr
     * @return max
     */
    public static int max(int[] arr) {
        int max = arr[0];
        // TODO max implementation
        return max;
    }

    /**
     * TODO Alex
     * Get the smallest value in the array.
     * @param arr
     * @return min
     */
    public static int min(int[] arr) {
        int min = arr[0];
        // TODO min implementation
        return min;
    }

    /**
     * Truncate an array at a cut off index.
     * E.g. {1, 2, 3, -1, -1, -1} 2 ==> {1, 2, 3}
     * @param arr
     * @param cutOffIndex
     * @return
     */
    public static int[] truncate(int[] arr, int cutOffIndex) {
        int size = cutOffIndex + 1;
        int[] truncated = new int[size];
        for(int i = 0; i < size; i++) {
            truncated[i] = arr[i];
        }
        return truncated;
    }

    /**
     * TODO Anirudh
     * Remove duplicate elements in an array.
     * E.g. {1, 3, 1, 7, 9} ==> {1, 3, 7, 9}
     * @param arr
     * @return
     */
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int cutOffIndex = -1;
        // TODO removeDuplicates implementation
        return truncate(temp, cutOffIndex);
    }
}
