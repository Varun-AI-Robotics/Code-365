class Solution {
    public int minRange(int a, int b, int c) {
        int[] lomi = new int[]{a, b, c};
        Arrays.sort(lomi);
        int x = lomi[0];
        int y = lomi[1];
        int z = lomi[2];
        return Math.min(z - x, y);
    }
}