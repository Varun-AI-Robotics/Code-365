 class Solution {

    static int[][][] dp;

    public int cherryPickup(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        dp = new int[n][m][m];

        for(int[][] arr : dp) {
            for(int[] a : arr) {
                Arrays.fill(a, -1);
            }
        }

        return solve(0, 0, m-1, grid);
    }

    private int solve(int row, int col1, int col2, int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        if(col1 < 0 || col2 < 0 || col1 >= m || col2 >= m) {
            return Integer.MIN_VALUE;
        }

        if(row == n-1) {
            if(col1 == col2) {
                return grid[row][col1];
            }

            return grid[row][col1] + grid[row][col2];
        }

        if(dp[row][col1][col2] != -1) {
            return dp[row][col1][col2];
        }

        int cherries = grid[row][col1];

        if(col1 != col2) {
            cherries += grid[row][col2];
        }

        int maxi = Integer.MIN_VALUE;

        for(int d1 = -1; d1 <= 1; d1++) {
            for(int d2 = -1; d2 <= 1; d2++) {

                int ans = solve(row+1, col1+d1,
                                col2+d2, grid);

                maxi = Math.max(maxi, ans);
            }
        }

        return dp[row][col1][col2] = cherries + maxi;
    }
}