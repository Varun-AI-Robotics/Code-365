class Solution {
    public int longestCommonSubsequence(String text1, String text2){
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        return solve(text1, text2, 0, 0 ,n ,m,dp);
    }
    int solve(String s1, String s2,int  i, int j ,int n, int m, int[][]dp ){
        if(i >= n || j >=m ){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] =  1 + solve(s1, s2, i + 1, j + 1,n,m, dp);
        }
        return dp[i][j] = Math.max(solve(s1, s2, i + 1, j ,n,m, dp), solve(s1, s2, i, j + 1,n,m, dp));
    }
}