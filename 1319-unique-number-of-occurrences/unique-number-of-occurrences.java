class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            if(arrMap.containsKey(key)){
                int freq = arrMap.get(key);
                arrMap.put(key, freq + 1);
            } else {
                arrMap.put(key, 1);
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int key : arrMap.keySet()){
            int val = arrMap.get(key);
            set.add(val);
        }
        return arrMap.size() == set.size();
    }
}