package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LengthOfLastWordTest {

    public LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    public void init() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void testOne() {
        String input = "Hello World";
        int expected = 5;

        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        String input = "   fly me   to   the moon  ";
        int expected = 4;

        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testThree() {
        String input = "luffy is still joyboy";
        int expected = 6;

        int actual = lengthOfLastWord.lengthOfLastWord(input);

        assertThat(actual).isEqualTo(expected);
    }

}