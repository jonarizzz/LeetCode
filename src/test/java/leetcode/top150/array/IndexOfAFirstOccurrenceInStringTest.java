package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class IndexOfAFirstOccurrenceInStringTest {

    public IndexOfAFirstOccurrenceInString indexOfAFirstOccurrenceInString;

    @BeforeEach
    public void init() {
        indexOfAFirstOccurrenceInString = new IndexOfAFirstOccurrenceInString();
    }

    @Test
    public void testOne() {
        String haystack = "sadbutsad", needle = "sad";
        int expected = 0;

        int actual = indexOfAFirstOccurrenceInString.strStr(haystack, needle);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        String haystack = "leetcode", needle = "leeto";
        int expected = -1;

        int actual = indexOfAFirstOccurrenceInString.strStr(haystack, needle);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testThree() {
        String haystack = "aaa", needle = "aaaa";
        int expected = -1;

        int actual = indexOfAFirstOccurrenceInString.strStr(haystack, needle);

        assertThat(actual).isEqualTo(expected);
    }

}