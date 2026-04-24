class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0,l=0,b=0;
        for(char c:moves.toCharArray()){
            if(c=='L')
                l++;
            else if(c=='R')
                r++;
            else
                b++;
        }
        return Math.abs(r-l)+b;
    }
}