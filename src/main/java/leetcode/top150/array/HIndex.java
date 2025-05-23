package leetcode.top150.array;

import org.springframework.stereotype.Service;

@Service
public class HIndex {

    // Given an array of integers citations where citations[i] is the number of citations a
    // researcher received for their ith paper, return the researcher's h-index.
    //
    // According to the definition of h-index on Wikipedia: The h-index is defined as the
    // maximum value of h such that the given researcher has published at least h papers
    // that have each been cited at least h times.

    // Example 1:
    //
    // Input: citations = [3,0,6,1,5]
    // Output: 3
    // Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them
    // had received 3, 0, 6, 1, 5 citations respectively.
    // Since the researcher has 3 papers with at least 3 citations each and the remaining
    // two with no more than 3 citations each, their h-index is 3.

    // Example 2:
    //
    // Input: citations = [1,3,1]
    // Output: 1

    // Constraints:
    //
    // n == citations.length
    // 1 <= n <= 5000
    // 0 <= citations[i] <= 1000

    public int hIndex(int[] citations) {

        int n = citations.length;

        int[] buckets = new int[n+1];

        for(int c : citations) {
            if(c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }


        int count = 0;
        for(int i = n; i >= 0; i--) {
            count += buckets[i];
            if(count >= i) {
                return i;
            }
        }
        return 0;
    }
}
