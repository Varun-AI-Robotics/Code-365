class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length;
        int n = arr2.length;
        int count = 0;
        for(int i = 0; i < m; i++){
            boolean valid = true;
            for(int j = 0; j < n;j++){
                int temp = Math.abs(arr1[i] - arr2[j]);
                if(temp <= d){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}