package com.example.demo.begginer;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LongerCommonPrefixTest {

    @Autowired
    LongerCommonPrefix longerCommonPrefix;

    @Test
    @DisplayName("1")
    public void longestCommonPrefixTestOne(){
        Assertions.assertEquals("qwe", longerCommonPrefix.longestCommonPrefix(new String[]{"qwerty", "qwertyuio", "qwe"}));
    }

    @Test
    @DisplayName("2")
    public void longestCommonPrefixTestTwo(){
        Assertions.assertEquals("fl", longerCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    @DisplayName("3")
    public void longestCommonPrefixTestThree(){
        Assertions.assertEquals("", longerCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    @DisplayName("4")
    public void longestCommonPrefixTestFour(){
        Assertions.assertEquals("", longerCommonPrefix.longestCommonPrefix(new String[]{"abab","aba",""}));
    }
}
