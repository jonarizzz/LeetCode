package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class CandyTest {

    public Candy candy;

    @BeforeEach
    public void init() {
        candy = new Candy();
    }

    @Test
    public void testOne() {
        int[] input = {1,0,2};
        int expected = 5;

        int actual = candy.candy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        int[] input = {1,2,2};
        int expected = 4;

        int actual = candy.candy(input);

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void testThree() {
        int[] input = {1,3,2,2,1};
        int expected = 7;

        int actual = candy.candy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFour() {
        int[] input = {1,2,87,87,87,2,1};
        int expected = 13;

        int actual = candy.candy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFive() {
        int[] input = {1,2,4,4,4,3};
        int expected = 10;

        int actual = candy.candy(input);

        assertThat(actual).isEqualTo(expected);
    }

}