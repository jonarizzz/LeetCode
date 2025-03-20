package leetcode.top150.array;

import leetcode.top150.array.MergeSortedArray;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MergeSortedArrayTest {

    @Autowired
    private MergeSortedArray mergeSortedArray;

    @Test
    public void exampleTestOne() {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;

        int[] result = mergeSortedArray.mergeSortedArray(num1, m, num2, n);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, result);
    }

    @Test
    public void exampleTestTwo() {
        int[] num1 = new int[]{1};
        int[] num2 = new int[]{};
        int m = 1;
        int n = 0;

        int[] result = mergeSortedArray.mergeSortedArray(num1, m, num2, n);

        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void exampleTestThree() {
        int[] num1 = new int[]{0};
        int[] num2 = new int[]{1};
        int m = 0;
        int n = 1;

        int[] result = mergeSortedArray.mergeSortedArray(num1, m, num2, n);

        assertArrayEquals(new int[]{1}, result);
    }

}