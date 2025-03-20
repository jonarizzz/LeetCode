package leetcode.top150.array;

import org.springframework.stereotype.Service;

@Service
public class MajorityElement {

    // https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

    // Given an array nums of size n, return the majority element.
    //
    // The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.

    // Example 1:
    //
    // Input: nums = [3,2,3]
    // Output: 3

    // Example 2:
    //
    // Input: nums = [2,2,1,1,1,2,2]
    // Output: 2

    // Constraints:
    //
    // n == nums.length
    // 1 <= n <= 5 * 104
    // -109 <= nums[i] <= 109

    // Follow-up: Could you solve the problem in linear time O(n) and in O(1) space?

    // Boyer–Moore majority vote algorithm
    //
    // Если элемент встречается более чем ⌊n/2⌋ раз, все другие элементы вместе
    // взятые не могут его “перебить”. Алгоритм постепенно нейтрализует (компенсирует)
    // влияние менее частых элементов используя простой счётчик.

    public int majorityElement(int[] nums) {

        int candidate = 0;
        int counter = 0;

        for (int num : nums) {

            if (counter == 0) {
                candidate = num;
                counter++;
            } else {
                if (num == candidate) {
                    counter++;
                } else {
                    counter--;
                }
            }
        }

        // after that we are guaranteed to have a suitable candidate

        int occurrences = 0;
        for (int num : nums) {
            if (num == candidate) {
                occurrences++;
            }
        }

        return (occurrences > nums.length / 2) ? candidate : 0;
    }

}
