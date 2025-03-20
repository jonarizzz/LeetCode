package leetcode.begginer;

import java.util.Objects;

public class RomanToInteger {

//    Runtime: 4 ms, faster than 98.28% of Java online submissions for Roman to Integer.
//    Memory Usage: 42.3 MB, less than 97.78% of Java online submissions for Roman to Integer.

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000


//    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
//    which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//    Roman numerals are usually written largest to smallest from left to right.
//    However, the numeral for four is not IIII. Instead, the number four is written as IV.
//    Because the one is before the five we subtract it making four. The same principle applies
//    to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//    Given a roman numeral, convert it to an integer.

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++){
            if (i + 1 == s.length()){
                result += translateSymbol(s.charAt(i));
            } else if (translateSymbol(s.charAt(i)) > translateSymbol(s.charAt(i + 1)) ||
                    Objects.equals(translateSymbol(s.charAt(i)), translateSymbol(s.charAt(i + 1)))){
                result += translateSymbol(s.charAt(i));
            } else {
                result -= translateSymbol(s.charAt(i));
            }
        }
        return result;
    }

    private static int translateSymbol(char symbol){
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Not roman character used!");
        };
    }

}
