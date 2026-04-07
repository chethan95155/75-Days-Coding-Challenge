class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] pos=new int[2];
        pos[0]=findFirst(nums,target);
        pos[1]=findLast(nums,target);
        return pos;
    }
    public int findFirst(int[] nums,int target){
        int l=0,h=nums.length-1,pos=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==target){
                pos=m;
                h=m-1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return pos;
    }
    public int findLast(int[] nums,int target){
        int l=0,h=nums.length-1,pos=-1;
        while(l<=h){
            int m=(l+h)/2;
            if(nums[m]==target){
                pos=m;
                l=m+1;
            }else if(nums[m]<target){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return pos;
    }
}