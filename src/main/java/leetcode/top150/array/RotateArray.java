package leetcode.top150.array;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RotateArray {

    // Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    //
    // Example 1:
    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
    // Explanation:
    // rotate 1 steps to the right: [7,1,2,3,4,5,6]
    // rotate 2 steps to the right: [6,7,1,2,3,4,5]
    // rotate 3 steps to the right: [5,6,7,1,2,3,4]
    //
    // Example 2:
    // Input: nums = [-1,-100,3,99], k = 2
    // Output: [3,99,-1,-100]
    // Explanation:
    // rotate 1 steps to the right: [99,-1,-100,3]
    // rotate 2 steps to the right: [3,99,-1,-100]
    //
    //
    // Constraints:
    //
    // 1. 1 <= nums.length <= 105
    // 2. -231 <= nums[i] <= 231 - 1
    // 3. 0 <= k <= 105
    //
    //
    // Follow up:
    //
    // 1. Try to come up with as many solutions as you can. There are at least three
    // different ways to solve this problem.
    // 2. Could you do it in-place with O(1) extra space?

    public void rotate(int[] nums, int k) {


        if (nums.length < k) {
            // Если массив меньше k, то остаток от деления покажет какой сдвиг нужно фактически сделать
            k = k % nums.length;
        }

        int secondPartIndex = nums.length - k;


        // Решение такое: делим массив пополам, разворачиваем каждую половинку, а потом разворачиваем массив целиком

        reverseListPart(nums, 0, secondPartIndex - 1);
        reverseListPart(nums, secondPartIndex, nums.length - 1);
        reverseListPart(nums, 0, nums.length - 1);
    }

    private void reverseListPart(int[] list, int startIndex, int endIndex) {
        int buffer;
        int sublistLength = endIndex - startIndex + 1;

        for (int i = 0; i < (sublistLength / 2); i++) {

            buffer = list[startIndex + i];
            list[startIndex + i] = list[startIndex + sublistLength - 1 - i];
            list[startIndex + sublistLength - 1 - i] = buffer;
        }
    }
}
