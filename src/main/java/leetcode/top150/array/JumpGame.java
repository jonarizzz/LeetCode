package leetcode.top150.array;

import org.springframework.stereotype.Service;

@Service
public class JumpGame {

    // You are given an integer array nums. You are initially positioned at the
    // array's first index, and each element in the array represents your maximum
    // jump length at that position.
    //
    // Return true if you can reach the last index, or false otherwise.

    // Example 1:
    //
    // Input: nums = [2,3,1,1,4]
    // Output: true
    // Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

    // Example 2:
    //
    // Input: nums = [3,2,1,0,4]
    // Output: false
    // Explanation: You will always arrive at index 3 no matter what. Its maximum
    // jump length is 0, which makes it impossible to reach the last index.

    // Constraints:
    //
    // 1 <= nums.length <= 104
    // 0 <= nums[i] <= 105

    public boolean canJump(int[] nums) {

        boolean canJump = true;
        int jumpsLeft = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (jumpsLeft != 0) {
                jumpsLeft--;
                if (jumpsLeft < nums[i]) {
                    jumpsLeft = nums[i];
                }
            } else {
                return false;
            }
        }


        return canJump;
    }

    // You are given a 0-indexed array of integers nums of length n. You are initially
    // positioned at nums[0].
    //
    // Each element nums[i] represents the maximum length of a forward jump from
    // index i. In other words, if you are at nums[i], you can jump to any
    // nums[i + j] where:
    //
    // 0 <= j <= nums[i] and
    // i + j < n
    //
    // Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated
    // such that you can reach nums[n - 1].

    // Example 1:
    //
    // Input: nums = [2,3,1,1,4]
    // Output: 2
    // Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step
    // from index 0 to 1, then 3 steps to the last index.

    // Example 2:
    //
    // Input: nums = [2,3,0,1,4]
    // Output: 2


    // Constraints:
    //
    // 1 <= nums.length <= 104
    // 0 <= nums[i] <= 1000
    // It's guaranteed that you can reach nums[n - 1].

    public int canJumpTwo(int[] nums) {

        int jumps = 0, currentEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;

    }

}
