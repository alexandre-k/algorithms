package algo;

import java.util.Comparator;
import java.util.Collections;

public class  MyQuickSort {

    @FunctionalInterface
    public interface Comparator<T> {
        int compare(T o1, T o2);
    }

    public static <E> void quicksort(E[] array, int start, int end, Comparator<E> comparator) {
        if (end - start <= 0) {
            return;
        }

        int i = start;
        int j = end - 1;
        boolean movingI = true;

        while (i < j) {
            if (comparator.compare(array[i] , array[j]) > 0) {
                Collections.swap(array, i, j);
                movingI = !movingI;
            } else {
                if (movingI) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        quicksort(array, start, i, comparator);
        quicksort(array, i + 1, end, comparator);
    }

    public static <E> void quicksort(E[] array, Comparator<E> comparator) {
        quicksort(array, 0, array.length, comparator);
    }


}
