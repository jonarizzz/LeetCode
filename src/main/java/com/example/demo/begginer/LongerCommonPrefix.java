package com.example.demo.begginer;

import org.springframework.stereotype.Service;

@Service
public class LongerCommonPrefix {
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
//
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.
//
//   Constraints:
//
//    1 <= strs.length <= 200
//    0 <= strs[i].length <= 200
//    strs[i] consists of only lowercase English letters.


    public String longestCommonPrefix(String[] strs) {

        // берём первую как наибольший общий префикс. Итерируясь по массиву проверяем, не найдётся ли в какой-нибудь
        // из строк несовпадений. Если находим такое несовпадение, то укорачиваем общий префикс до совпадения

        String longestCommonPrefix = strs[0];

        for (int i = 1; i < strs.length; i++){

            int maxLength = longestCommonPrefix.length();
            String current = strs[i];

            if (current.length() == 0){
                return "";
            }

            for (int j = 0; j < maxLength; j++){

                // если новая строка меньше последовательности, то последовательность обрезается до размера новой
                // строки и сравнивается посимвольно

                if (current.length() < maxLength){
                    maxLength = current.length();
                    longestCommonPrefix = longestCommonPrefix.substring(0, current.length());
                }


                if (current.charAt(j) != longestCommonPrefix.charAt(j)){
                    longestCommonPrefix = longestCommonPrefix.substring(0, j);
                    break;
                }


            }
        }

        return longestCommonPrefix;
    }
}
