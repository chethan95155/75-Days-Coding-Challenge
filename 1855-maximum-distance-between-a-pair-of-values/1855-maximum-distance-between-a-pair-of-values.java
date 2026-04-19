class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i,j=1;
        int n=nums1.length;
        int m=nums2.length;
        for(i=0;i<n && j<m;j++){
            if(nums1[i]>nums2[j])
                i++;
        }
        return j-i-1;
    }
}