package leetcode.top150.array;


public class IndexOfAFirstOccurrenceInString {

    // Given two strings needle and haystack, return the index of the
    // first occurrence of needle in haystack, or -1 if needle is not
    // part of haystack.

    // Example 1:
    //
    // Input: haystack = "sadbutsad", needle = "sad"
    // Output: 0
    // Explanation: "sad" occurs at index 0 and 6.
    // The first occurrence is at index 0, so we return 0.

    // Example 2:
    //
    // Input: haystack = "leetcode", needle = "leeto"
    // Output: -1
    // Explanation: "leeto" did not occur in "leetcode", so we return -1.

    // Constraints:
    //
    // 1 <= haystack.length, needle.length <= 104
    // haystack and needle consist of only lowercase English characters.

    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() + i > haystack.length()) {
                    return -1;
                }

                String needleCandidate = haystack.substring(i, i + needle.length());

                if (needleCandidate.equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
