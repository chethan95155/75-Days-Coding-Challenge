class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c))
                s1.append(Character.toLowerCase(c));
        }
        String or=s1.toString();
        String rev=s1.reverse().toString();
        return or.equals(rev);
    }
}