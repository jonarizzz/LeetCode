package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class RemoveDuplicatesFromSortedArrayTest {

    @Autowired
    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Test
    public void removeDuplicatesTestOne(){
        int[] input = {1,1,2};
        int[] expected = {1,2};

        int k = removeDuplicatesFromSortedArray.removeDuplicates(input);

        assertThat(k).isEqualTo(expected.length);
        for (int i = 0; i < k; i++) {
            assertThat(input[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    public void removeDuplicatesTestTwo(){
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        int[] expected = {0,1,2,3,4};

        int k = removeDuplicatesFromSortedArray.removeDuplicates(input);

        assertThat(k).isEqualTo(expected.length);
        for (int i = 0; i < k; i++) {
            assertThat(input[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    public void removeDuplicatesTwoTestOne(){
        int[] input = {1,1,1,2,2,3};
        int[] expected = {1,1,2,2,3};

        int k = removeDuplicatesFromSortedArray.removeDuplicatesTwo(input);

        assertThat(k).isEqualTo(expected.length);

        for (int i = 0; i < k; i++) {
            assertThat(input[i]).isEqualTo(expected[i]);
        }
    }

    @Test
    public void removeDuplicatesTwoTestTwo(){
        int[] input = {0,0,1,1,1,1,2,3,3};
        int[] expected = {0,0,1,1,2,3,3};

        int k = removeDuplicatesFromSortedArray.removeDuplicatesTwo(input);

        assertThat(k).isEqualTo(expected.length);

        for (int i = 0; i < k; i++) {
            assertThat(input[i]).isEqualTo(expected[i]);
        }
    }
}