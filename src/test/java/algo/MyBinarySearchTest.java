package algo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyBinarySearchTest {

    @Test
    @DisplayName("Search for an integer in an array")
    public void testSearch() {
        int[] array = {1, 23, 59, 67, 102, 342, 456, 543, 667, 4353, 264053};
        assertEquals(MyBinarySearch.search(23, array), 1);
        assertEquals(MyBinarySearch.search(543, array), 7);
        assertEquals(MyBinarySearch.search(544, array), -1);
    }

    @Test
    @DisplayName("Recursively search for an integer in an array")
    public void testRecursiveSearch() {
        int[] array = {1, 23, 59, 67, 102, 342, 456, 543, 667, 4353, 264053};
        assertEquals(MyBinarySearch.recurSearch(102, array, 0, array.length), 4);
        assertEquals(MyBinarySearch.recurSearch(4353, array, 0, array.length), 9);
        assertEquals(MyBinarySearch.recurSearch(544, array, 0, array.length), -1);
    }

}
