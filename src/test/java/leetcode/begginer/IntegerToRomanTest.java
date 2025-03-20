package leetcode.begginer;

import leetcode.begginer.IntegerToRoman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegerToRomanTest {

    @Autowired
    IntegerToRoman integerToRoman;

    @Test
    @DisplayName("3")
    void romanToInt1() {
        Assertions.assertEquals("III", integerToRoman.intToRoman(3));
    }

    @Test
    @DisplayName("1994")
    void romanToInt2() {
        Assertions.assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

    @Test
    @DisplayName("2399")
    void integerToRomanTest1(){
        Assertions.assertEquals("MMCCCXCIX", integerToRoman.intToRoman(2399));
    }

}
