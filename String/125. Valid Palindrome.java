class Solution {
    public boolean isPalindrome(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                count++;
            }
        }
        char[] arr=new char[count];
        int index=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                arr[index]=Character.toLowerCase(ch);
                index++;
            }
        }
        int lol=arr.length/2;
        int k=arr.length-1;
        for(int i=0;i<lol;i++){
            if(arr[i]!=arr[k]){
                return false;
            }
            k--;
        }
        return true;
    }
}