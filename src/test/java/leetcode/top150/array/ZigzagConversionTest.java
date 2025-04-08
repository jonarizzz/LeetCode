package leetcode.top150.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ZigzagConversionTest {

    public ZigzagConversion zigzagConversion;

    @BeforeEach
    public void init() {
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    public void testOne() {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        String actual = zigzagConversion.convert(input, numRows);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testTwo() {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";

        String actual = zigzagConversion.convert(input, numRows);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testThree() {
        String input = "A";
        int numRows = 1;
        String expected = "A";

        String actual = zigzagConversion.convert(input, numRows);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testFour() {
        String input = "123456789012345678901";
        int numRows = 5;
        String expected = "197280683715946240531";

        String actual = zigzagConversion.convert(input, numRows);

        assertThat(actual).isEqualTo(expected);
    }


}