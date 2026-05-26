class Solution {
    public int numberOfSpecialChars(String word) {
        int[] sml=new int[26];
        int[] cap=new int[26];
        for(char ch:word.toCharArray()){
            if(Character.isUpperCase(ch))
                cap[ch-'A']++;
            else
                sml[ch-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(cap[i]>=1 && sml[i]>=1)
                ans++;
        }
        return ans;
    }
}