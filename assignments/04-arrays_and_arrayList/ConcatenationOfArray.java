package com.gunjana.Assignment.Arrays_ArrayList;

import java.util.Arrays;

/** PROGRAM 2 : Concatenation of Arrays
 *  Understanding the problem :
 *          We have ->  nums[n]             // {1, 2, 1}  n = 3
 *          Declare -> ans[2n]              // ans[6]
 *          for n > i >= 0
 *              ans[i] = nums[i]
 *              ans[i + n] = nums[i]
 *
 *          Iteration 1:
 *                      ans[0] = nums[0] = 1    => ans[0] = 1
 *                      ans[0 + 3] = nums[0]    => ans[3] = 1
 *          Iteration 2:
 *                      ans[1] = nums[1] = 2    => ans[1] = 1
 *                      ans[1 + 3] = nums[1]    => ans[4] = 2
 *          Iteration 3:
 *                      ans[2] = nums[2] = 1    => ans[2] = 1
 *                      ans[2 + 3] = nums[2]    => ans[5] = 1
 *
 *                ans[] = {1, 2, 1, 1, 2, 1};
 *
 *          Basically, - > ans[] = nums[] + nums[]   //Concatenation
 * **/

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        for(int i = 0; i < len; i++){
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }
        return ans;
    }
}
