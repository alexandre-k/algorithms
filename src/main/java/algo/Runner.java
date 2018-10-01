package algo;

import algo.Recursion;
import algo.BinarySearch;

public class Runner {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println(Recursion.withArrayFibonacci(40));
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(BinarySearch.search(array, 9));
        System.out.println(BinarySearch.search(array, 11));
    }
}
