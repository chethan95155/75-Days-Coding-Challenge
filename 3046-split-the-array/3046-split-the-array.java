class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++)
            max=Math.max(max,nums[i]);
        int[] freq=new int[max+1];
        Arrays.fill(freq,0);
        for(int x:nums)
            freq[x]++;
        for(int i=0;i<=max;i++){
            if(freq[i]>2)
                return false;
        }
        return true;
    }
}