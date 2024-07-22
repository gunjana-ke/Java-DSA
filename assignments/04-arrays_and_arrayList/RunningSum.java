package com.gunjana.Assignment.Arrays_ArrayList;

import java.util.Arrays;

/** PROGRAM 3 : Running Sum of 1d Array
 *  Understanding the problem :
 *      Basically yor are adding the value of current index and the value of previous index
 *      and storing  it to the current index.
 *
 *      Example : nums[] = {1, 2, 3, 4};
 *
 *                We take -> sum = sum + nums[index]
 *
 *            Iteration 1 :
 *              For nums[0] -> sum = 0 + nums[0] = 1        //sum is initialized to 0
 *                  nums[0] = 1
 *
 *            Iteration 2 :
 *              For nums[1] -> sum = 1 + nums[1] = 3        //sum is 1 (From Iteration 1)
 *                  nums[1] = 3
 *
 *            Iteration 3 :
 *              For nums[2] -> sum = 3 + nums[2] = 6        //sum is 1 (From Iteration 1)
 *                  nums[2] = 6
 *
 *            Iteration 4 :
 *              For nums[3] -> sum = 6 + nums[3] = 10        //sum is 1 (From Iteration 1)
 *                  nums[3] = 10
 *
 *             => nums[] = {1, 3, 6, 10};
 * **/

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
