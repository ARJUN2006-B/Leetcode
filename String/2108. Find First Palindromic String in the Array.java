class Solution {
    public String firstPalindrome(String[] words) {
        int ss=words.length;
        int i=0;
        while(i<ss){
           String s=words[i];
           char[] arr=s.toCharArray();
           int size=arr.length/2;
           int k=arr.length-1;
           int flag=1;
           for(int j=0;j<size;j++){
            if(arr[j]!=arr[k]){
                flag=0;
                break;
            }
            k--;
           }
           if(flag==1){
             return new String(arr);
           }
           else{
            i++;
           }
        }

        return "";
    }
}