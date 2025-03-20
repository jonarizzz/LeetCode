package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class MajorityElementTest {

    @Autowired
    MajorityElement majorityElement;

    @Test
    public void majorityElementTestOne() {
        int[] input = {3,2,3};
        int expected = 3;

        int result = majorityElement.majorityElement(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void majorityElementTestTwo() {
        int[] input = {2,2,1,1,1,2,2};
        int expected = 2;

        int result = majorityElement.majorityElement(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void majorityElementTestThree() {
        int[] input = {6,5,5};
        int expected = 5;

        int result = majorityElement.majorityElement(input);

        assertThat(result).isEqualTo(expected);
    }

}