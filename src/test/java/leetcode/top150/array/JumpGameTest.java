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
}