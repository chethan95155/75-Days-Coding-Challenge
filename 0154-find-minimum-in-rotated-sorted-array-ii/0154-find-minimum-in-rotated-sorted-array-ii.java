class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        for(int i=0;i<n;i++){
            if(ans>=nums[i])
                ans=nums[i];
        }
        return ans;
    }
}