class Solution {
    public boolean isSubsequence(String s, String t) {
        int left=0;
        int right=0;
        int count=0;
        while(left<t.length() && right<s.length()){
            if(t.charAt(left)!=s.charAt(right)){
                left++;
                continue;
            }
            if(t.charAt(left)==s.charAt(right)){
                count++;
                left++;
                right++;
            }
        }
        if(count==s.length()){
          return true;
        }
        return false;
    }
}