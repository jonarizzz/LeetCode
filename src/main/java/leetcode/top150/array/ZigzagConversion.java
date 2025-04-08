package leetcode.top150.array;

public class ZigzagConversion {

    // The string "PAYPALISHIRING" is written in a zigzag pattern
    // on a given number of rows like this: (you may want to
    // display this pattern in a fixed font for better legibility)
    //
    // P   A   H   N
    // A P L S I I G
    // Y   I   R
    //
    // And then read line by line: "PAHNAPLSIIGYIR"
    //
    // Write the code that will take a string and make this
    // conversion given a number of rows:
    //
    // string convert(string s, int numRows);

    // Example 1:
    //
    // Input: s = "PAYPALISHIRING", numRows = 3
    // Output: "PAHNAPLSIIGYIR"

    // Example 2:
    //
    // Input: s = "PAYPALISHIRING", numRows = 4
    // Output: "PINALSIGYAHRPI"
    // Explanation:
    // P     I    N
    // A   L S  I G
    // Y A   H R
    // P     I


    // Example 3:
    //
    // Input: s = "A", numRows = 1
    // Output: "A"

    // Constraints:
    //
    // 1 <= s.length <= 1000
    // s consists of English letters (lower-case and upper-case), ',' and '.'.
    // 1 <= numRows <= 1000

    public String convert(String s, int numRows) {

        StringBuilder result = new StringBuilder();

        int offset = numRows + numRows - 2;

        if (offset == 0) {
            return s;
        }

        for (int i = 0; i < numRows; i++) {

            int step = 0;

            while (step * offset + i < s.length()) {

                int elementIndex = step * offset + i;
                int nextDiagonalElementIndex = elementIndex + offset - (i * 2);

                result.append(s.charAt(elementIndex));

                if (i != 0 && i != numRows - 1 && nextDiagonalElementIndex < s.length()) {
                    result.append(s.charAt(nextDiagonalElementIndex));
                }

                step++;
            }

        }

        return result.toString();

    }
}
