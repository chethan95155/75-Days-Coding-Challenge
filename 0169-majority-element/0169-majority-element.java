class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int m=n/2+1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>=m){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}