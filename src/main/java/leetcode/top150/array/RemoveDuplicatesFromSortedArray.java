package leetcode.top150.array;

import org.springframework.stereotype.Service;

@Service
public class RemoveDuplicatesFromSortedArray {

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
    //
    // Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
    // such that each unique element appears only once. The relative order of the elements should
    // be kept the same. Then return the number of unique elements in nums.
    //
    // Consider the number of unique elements of nums to be k, to get accepted, you need to do the
    // following things:
    //
    // 1. Change the array nums such that the first k elements of nums contain the unique elements in
    // the order they were present in nums initially. The remaining elements of nums are not
    // important as well as the size of nums.
    //
    // 2. Return k.
    //
    //
    // Custom Judge:
    //
    // The judge will test your solution with the following code:
    //
    // int[] nums = [...]; // Input array
    // int[] expectedNums = [...]; // The expected answer with correct length
    //
    // int k = removeDuplicates(nums); // Calls your implementation
    //
    // assert k == expectedNums.length;
    // for (int i = 0; i < k; i++) {
    //    assert nums[i] == expectedNums[i];
    // }
    //
    // If all assertions pass, then your solution will be accepted.

    public int removeDuplicates(int[] nums) {
        int uniqueCounter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[uniqueCounter]) {
                uniqueCounter ++;
                nums[uniqueCounter] = nums[i];
            }
        }

        return uniqueCounter + 1;
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150

    // Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place
    // such that each unique element appears at most twice. The relative order of the elements
    // should be kept the same.
    //
    // Since it is impossible to change the length of the array in some languages, you must instead
    // have the result be placed in the first part of the array nums. More formally, if there are
    // k elements after removing the duplicates, then the first k elements of nums should hold the
    // final result. It does not matter what you leave beyond the first k elements.
    //
    // Return k after placing the final result in the first k slots of nums.
    //
    // Do not allocate extra space for another array. You must do this by modifying the input array
    // in-place with O(1) extra memory.
    //
    // Custom Judge:
    //
    // The judge will test your solution with the following code:
    //
    // int[] nums = [...]; // Input array
    // int[] expectedNums = [...]; // The expected answer with correct length
    //
    // int k = removeDuplicates(nums); // Calls your implementation
    //
    // assert k == expectedNums.length;
    // for (int i = 0; i < k; i++) {
    //    assert nums[i] == expectedNums[i];
    // }
    // If all assertions pass, then your solution will be accepted.

    public int removeDuplicatesTwo(int[] nums) {

        int uniqueCounter = 0;
        boolean isDuplicateThereAlready = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == nums[uniqueCounter]) {
                if (i != 0 && !isDuplicateThereAlready) {
                    isDuplicateThereAlready = true;
                    uniqueCounter++;
                    nums[uniqueCounter] = nums[i];
                }
            } else {
                isDuplicateThereAlready = false;
                uniqueCounter++;
                nums[uniqueCounter] = nums[i];
            }
        }

        return uniqueCounter + 1;
    }
}
