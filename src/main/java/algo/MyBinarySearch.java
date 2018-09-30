package algo;

public class MyBinarySearch {

    public static int search(int value, int[] array) {
        int low = 0;
        int mid = 0;
        int high = array.length;

        while (low <= high) {
            mid = (high + low) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int recurSearch(int value, int[] array, int low, int high) {
        int mid = (high + low) / 2;

        if (low > high) 
            return -1;

        if (array[mid] == value)
            return mid;

        if (array[mid] < value)
            return recurSearch(value, array, mid + 1, high);

        if (array[mid] > value)
            return recurSearch(value, array, low, mid - 1);

        return -1;
    }
}
