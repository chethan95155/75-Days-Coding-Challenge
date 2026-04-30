class Solution {
    public boolean judgeCircle(String moves) {
        int ansx=0;
        int ansy=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')
                ansx--;
            else if(ch=='D')
                ansx++;
            else if(ch=='L')
                ansy--;
            else
                ansy++;
        }
        return ansx==0 && ansy==0;
    }
}