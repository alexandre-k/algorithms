package algo;

public class BinarySearch {
    public static int search(int[] array, int n) {
        int lo = 0;
        int hi = array.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;
            if (n < array[mid]) hi = mid - 1;
            else if (n > array[mid]) lo = mid + 1;
            else return array[mid];
        }
        return -1;
    }
}
