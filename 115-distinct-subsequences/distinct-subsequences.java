class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(s, t, m, n, dp);
    }
    public int solve(String s1, String s2,  int i, int j, int[][] dp){
        if(j == 0){
            return 1;
        }
        if(i == 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(s1.charAt(i - 1) == s2.charAt(j - 1)){
            int take = solve(s1, s2, i - 1, j - 1, dp);
            int skip = solve(s1, s2, i - 1, j, dp);
            return dp[i][j] = take + skip;
        }
        return dp[i][j] = solve(s1, s2, i - 1, j, dp);
    }
}