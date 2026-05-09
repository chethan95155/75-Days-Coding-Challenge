class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entry = new ArrayList<>(map.entrySet());
        entry.sort((a, b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];
        int c = 0;
        for (Map.Entry<Integer, Integer> i : entry) {
            if (c >= k)
                break;
            ans[c++] = i.getKey();
        }

        return ans;
    }
}