package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseWordsInStringTest {

    public ReverseWordsInString reverseWordsInString;

    @BeforeEach
    public void init() {
        reverseWordsInString = new ReverseWordsInString();
    }

    @Test
    public void testOne() {
        String input = "the sky is blue";
        String expected = "blue is sky the";

        String actual = reverseWordsInString.reverseWords(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        String input = "  hello world  ";
        String expected = "world hello";

        String actual = reverseWordsInString.reverseWords(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testThree() {
        String input = "a good   example";
        String expected = "example good a";

        String actual = reverseWordsInString.reverseWords(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFour() {
        String input = "EPY2giL";
        String expected = "EPY2giL";

        String actual = reverseWordsInString.reverseWords(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFive() {
        String input = "t ";
        String expected = "t";

        String actual = reverseWordsInString.reverseWords(input);

        assertThat(actual).isEqualTo(expected);
    }

}