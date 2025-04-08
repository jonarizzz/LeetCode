package leetcode.top150.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RomanToIntegerTest {

    @Test
    @DisplayName("III")
    void romanToInt1() {
        Assertions.assertEquals(3, RomanToInteger.romanToInt("III"));
    }

    @Test
    @DisplayName("MCMXCIV")
    void romanToInt2() {
        Assertions.assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }

    @Test
    @DisplayName("MMCCCXCIX")
    void romanToInt3() {
        Assertions.assertEquals(2399, RomanToInteger.romanToInt("MMCCCXCIX"));
    }

}
