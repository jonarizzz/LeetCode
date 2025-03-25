package leetcode.top150.array;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JumpGameTest {

    @Autowired
    public JumpGame jumpGame;

    @Test
    public void canJumpTestOne() {
        int[] input = {2,3,1,1,4};
        boolean expected = true;

        boolean actual = jumpGame.canJump(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTestTwo() {
        int[] input = {3,2,1,0,4};
        boolean expected = false;

        boolean actual = jumpGame.canJump(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestOne() {
        int[] input = {2,3,1,1,4};
        int expected = 2;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestTwo() {
        int[] input = {2,3,0,1,4};
        int expected = 2;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestThree() {
        int[] input = {1};
        int expected = 0;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestFour() {
        int[] input = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
        int expected = 2;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestFive() {
        int[] input = {1,2};
        int expected = 1;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canJumpTwoTestSix() {
        int[] input = {1,1,1,1};
        int expected = 3;

        int actual = jumpGame.canJumpTwo(input);

        assertThat(actual).isEqualTo(expected);
    }
}