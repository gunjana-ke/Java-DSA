package com.gunjana.Assignment.Arrays_ArrayList;

import java.util.Arrays;

/** PROBLEM 1 : Build Array from Permutation
 *  Understanding the problem :
 *          ans[i] = nums[nums[i]]  //This indicates that we have to take the value of nums[i]
 *                                    as the index and pass it to nums and the value in that index
 *                                    will be the value of the array.
 *          Example : Input
 *                    nums[] = {2, 3, 4, 1, 0};
 *                    ans[i] = nums[nums[i]]
 *                 Iteration
 *                    ans[0] = nums[nums[0]] = nums[2] =  4
 *                    ans[1] = nums[nums[1]] = nums[3] =  1
 *                    ans[2] = nums[nums[2]] = nums[4] =  0
 *                    ans[3] = nums[nums[3]] = nums[1] =  3
 *                    ans[4] = nums[nums[4]] = nums[0] =  2
 *
 *                    ans[] = {4, 1, 0, 3, 2};
 *
 *   Time Complexity : O(n)
 *   Space Complexity : O(n)
 *
 * **/

public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 1, 0};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    //Solution of leetcode
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
