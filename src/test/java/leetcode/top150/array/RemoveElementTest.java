package leetcode.top150.array;

import leetcode.top150.array.RemoveElement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class RemoveElementTest {

    @Autowired
    RemoveElement removeElement;

    @Test
    public void removeElementTestOne() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] expectedNums = {2, 2};

        int k = removeElement.removeElement(nums, val);

        assertThat(k).isEqualTo(expectedNums.length);

        Arrays.sort(nums, 0, k);
        assertThat(Arrays.copyOf(nums, k)).isEqualTo(expectedNums);
    }

    @Test
    public void removeElementTestTwo() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int[] expectedNums = {0, 0, 1, 3, 4};

        int k = removeElement.removeElement(nums, val);

        assertThat(k).isEqualTo(expectedNums.length);

        Arrays.sort(nums, 0, k);
        assertThat(Arrays.copyOf(nums, k)).isEqualTo(expectedNums);

    }


}