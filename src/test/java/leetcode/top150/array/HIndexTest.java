package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HIndexTest {

    @Autowired
    HIndex hIndex;

    @Test
    void hIndexTestOne() {
        int[] input = {3,0,6,1,5};
        int expected = 3;

        int actual = hIndex.hIndex(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void hIndexTestTwo() {
        int[] input = {1,3,1};
        int expected = 1;

        int actual = hIndex.hIndex(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void hIndexTestThree() {
        int[] input = {100};
        int expected = 1;

        int actual = hIndex.hIndex(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void hIndexTestFour() {
        int[] input = {8,3,1,2,6,3,7,0};
        int expected = 3;

        int actual = hIndex.hIndex(input);

        assertThat(actual).isEqualTo(expected);
    }
}