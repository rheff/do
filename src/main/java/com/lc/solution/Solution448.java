package com.lc.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        method2(nums);
    }

    public static List<Integer> method1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[Math.abs(nums[i]) - 1] = -Math.abs(nums[Math.abs(nums[i]) - 1]);
        }
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                returnList.add(i + 1);
            }
        }
        return returnList;
    }

    public static List<Integer> method2(int[] nums) {
        for (int i = 0; i < nums.length; ) {
            //如果第i个位置等于i+1  || 第i个位置的数据a 等于num[a]时（说明有相同数据）
            if (nums[i] == i + 1 || nums[i] == nums[nums[i] - 1]) {
                i++;
            } else {
                // 将 i位置的数据a 与num[a-1]位置 数据交换， 这样 a 就移动到a-1位置上了。
                exchange(nums, i, nums[i] - 1);
            }
        }
        List<Integer> returnList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                returnList.add(i + 1);
            }
        }
        return returnList;
    }

    public static void exchange(int[] nums, int a, int b) {
        nums[a] = nums[a] + nums[b];
        nums[b] = nums[a] - nums[b];
        nums[a] = nums[a] - nums[b];
    }
}
