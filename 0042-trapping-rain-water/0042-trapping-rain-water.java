class Solution {
    public int trap(int[] a) {
        int n=a.length;
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=a[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],a[i]);
        }
        r[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],a[i]);
        }
        int water=0;
        for(int i=1;i<n-1;i++)
            water+=Math.min(l[i],r[i])-a[i];
        return water;
    }
}