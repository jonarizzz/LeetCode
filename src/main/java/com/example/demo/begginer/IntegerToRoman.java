package com.example.demo.begginer;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IntegerToRoman {

//    Runtime: 21 ms, faster than 20.18% of Java online submissions for Integer to Roman.
//    Memory Usage: 42.8 MB, less than 86.52% of Java online submissions for Integer to Roman.

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

//    For example, 2 is written as II in Roman numeral, just two ones added together.
//    12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//    Roman numerals are usually written largest to smallest from left to right. However,
//    the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is
//    before the five we subtract it making four. The same principle applies to the number nine,
//    which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//    Given an integer, convert it to a roman numeral.

    public String intToRoman(int num) {

        TreeMap<Integer, String> dict = new TreeMap<>();
        dict.put(1, "I");
        dict.put(4, "IV");
        dict.put(5, "V");
        dict.put(9, "IX");
        dict.put(10, "X");
        dict.put(40, "XL");
        dict.put(50, "L");
        dict.put(90, "XC");
        dict.put(100, "C");
        dict.put(400, "CD");
        dict.put(500, "D");
        dict.put(900, "CM");
        dict.put(1000, "M");

        StringBuilder result = new StringBuilder();

        while (num > 0){
            int key = dict.floorKey(num);
            result.append(dict.get(key));
            num -= key;
        }
        return result.toString();
    }
}
