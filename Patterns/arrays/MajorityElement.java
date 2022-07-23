class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // if (!map.containsKey(num))
            //     map.put(num, 1);
            // else map.put(num, map.get(num) + 1);
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > nums.length / 2) return num;
        }
        return 0;
    }
}
