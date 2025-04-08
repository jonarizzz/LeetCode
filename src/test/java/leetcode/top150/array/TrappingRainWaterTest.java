package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TrappingRainWaterTest {

    public TrappingRainWater trappingRainWater;

    @BeforeEach
    public void init() {
        trappingRainWater = new TrappingRainWater();
    }

    @Test
    public void testOne() {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;

        int actual = trappingRainWater.trap(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        int[] input = {4,2,0,3,2,5};
        int expected = 9;

        int actual = trappingRainWater.trap(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testThree() {
        int[] input = {4,2,3};
        int expected = 1;

        int actual = trappingRainWater.trap(input);

        assertThat(actual).isEqualTo(expected);
    }


}