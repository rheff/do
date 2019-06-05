package com.lc;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                returnList.add(i + 1);
            }
        }
        return returnList;
    }
}
