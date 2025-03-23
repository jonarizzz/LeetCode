package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
class RotateArrayTest {

    @Autowired
    RotateArray rotateArray;

    @Test
    public void rotateArrayTestOne() {
        int[] input = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};

        rotateArray.rotate(input, k);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void rotateArrayTestTwo() {
        int[] input = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};

        rotateArray.rotate(input, k);

        assertThat(input).isEqualTo(expected);
    }

    @Test
    public void rotateArrayTestThree() {
        int[] input = {-1};
        int k = 2;
        int[] expected = {-1};

        rotateArray.rotate(input, k);

        assertThat(input).isEqualTo(expected);
    }

}