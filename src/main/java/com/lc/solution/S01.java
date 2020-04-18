package com.lc.solution;

public class S01 {

    public int[] twoSumM1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public int[] twoSumM2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public int minDistance(String word1, String word2) {
        int x = word1.length();
        int y = word2.length();
        int[][] dp = new int[x +1 ][y + 1];
        // 其中一个字符串为空 返回字符串长度
        if (x == 0 || y == 0) {
            return x +y;
        }
        for (int i = 0 ;i < x +1 ; i++) {
            dp[i][0] = i;
        }
        for (int j = 0 ;j < y +1; j++) {
            dp[0][j] = j;
        }
        for (int i = 1;i < x +1 ; i++) {
            for (int j = 1 ;j < y+1 ; j++) {
                int leftUp = dp[i-1][j];
                int leftDown = dp[i-1][j-1];
                int rightDown = dp[i][j-1];
                if(word2.charAt(j -1 ) == word1.charAt(i-1)) {
                    dp[i][j] = Math.min(Math.min(leftUp +1 , leftDown), rightDown + 1);
                } else {
                    dp[i][j] = Math.min(Math.min(leftUp, leftDown), rightDown) +1;
                }
            }
        }
        return dp[x][y];
    }


}
