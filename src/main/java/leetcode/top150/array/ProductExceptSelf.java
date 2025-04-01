package leetcode.top150.array;

public class ProductExceptSelf {

    // Given an integer array nums, return an array answer such that answer[i] is
    // equal to the product of all the elements of nums except nums[i].
    // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    // You must write an algorithm that runs in O(n) time and without using the division operation.

    // Example 1:
    //
    // Input: nums = [1,2,3,4]
    // Output: [24,12,8,6]

    // Example 2:
    //
    // Input: nums = [-1,1,0,-3,3]
    // Output: [0,0,9,0,0]

    // Constraints:
    //
    // 2 <= nums.length <= 105
    // -30 <= nums[i] <= 30
    // The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

    // Follow up: Can you solve the problem in O(1) extra space complexity? (The output
    // array does not count as extra space for space complexity analysis.)


    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        int temp = 1;

        result[nums.length - 1] = 1;

        // Going from right to left
        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] = nums[i + 1] * result[i + 1];
        }

        // Going from left to right
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i - 1] * temp;
            result[i] = temp * result[i];
        }

        return result;
    }

}
