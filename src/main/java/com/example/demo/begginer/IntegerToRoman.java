package com.example.demo.begginer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    List<String> ones = new ArrayList<>();
    List<String> fives = new ArrayList<>();


    public String intToRoman(int num) {

        StringBuilder result = new StringBuilder();
        String strNumber = Integer.toString(num);

        ones.add(0, "I");
        ones.add(1, "X");
        ones.add(2, "C");
        ones.add(3, "M");

        fives.add(0, "V");
        fives.add(1, "L");
        fives.add(2, "D");

        for (int i = strNumber.length(); i > 0; i--) {
            result.insert(0, convertSingleNumber(strNumber.length() - i, strNumber.charAt(i-1)));
        }

        return result.toString();
    }

    private String convertSingleNumber(int digitNumber, char number){
        return switch (number) {
            case '0' -> "";
            case '1' -> ones.get(digitNumber);
            case '2' -> ones.get(digitNumber) + ones.get(digitNumber);
            case '3' -> ones.get(digitNumber) + ones.get(digitNumber) + ones.get(digitNumber);
            case '4' -> ones.get(digitNumber) + fives.get(digitNumber);
            case '5' -> fives.get(digitNumber);
            case '6' -> fives.get(digitNumber) + ones.get(digitNumber);
            case '7' -> fives.get(digitNumber) + ones.get(digitNumber) + ones.get(digitNumber);
            case '8' -> fives.get(digitNumber) + ones.get(digitNumber) + ones.get(digitNumber) + ones.get(digitNumber);
            case '9' -> ones.get(digitNumber) + ones.get(digitNumber + 1);
            default -> throw new IllegalArgumentException();
        };

    }
}
