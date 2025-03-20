package leetcode.top150.array;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MergeSortedArray {

    // 88. Merge Sorted Array (https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150)

    // You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    // and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    // The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    // To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
    // should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

    // Follow up: Can you come up with an algorithm that runs in O(m + n) time? Solved

    // Note that because m = 0, there are no elements in nums1.
    // The 0 is only there to ensure the merge result can fit in nums1.

    // Constraints:
    // nums1.length == m + n
    // nums2.length == n
    // 0 <= m, n <= 200
    // 1 <= m + n <= 200
    // -109 <= nums1[i], nums2[j] <= 109

    protected int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int elementsTotal = m + n;
        int firstCounter = 0;
        int secondCounter = 0;
        int[] result = new int[elementsTotal];

        for (int i = 0; i < elementsTotal; i++) {

            if (firstCounter == m) {
                result[i] = nums2[secondCounter];
                secondCounter++;
                continue;
            }

            if (secondCounter == n) {
                result[i] = nums1[firstCounter];
                firstCounter++;
                continue;
            }

            if (nums1[firstCounter] < nums2[secondCounter]) {
                result[i] = nums1[firstCounter];
                firstCounter++;
            } else {
                result[i] = nums2[secondCounter];
                secondCounter++;
            }
        }

        nums1 = result;

        System.out.println(Arrays.toString(nums1));

        return result;
    }

}
