class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> jewel = new HashMap<>();
        for(int i = 0; i < jewels.length(); i++){
            char key = jewels.charAt(i);
            if(jewel.containsKey(key)){
                int freq = jewel.get(i);
                jewel.put(key, freq + 1);
            } else{
                jewel.put(key, 1);
            }
        }

        int count = 0;
        for(int i = 0; i < stones.length(); i++){
            char key = stones.charAt(i);
            if(jewel.containsKey(key)){
                count++;
            }
        }
        return count;
    }
}