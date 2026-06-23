class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        String[] ans=new String[arr.length];
        int k=0;
        for(int i=arr.length-1;i>=0;i--){
             ans[k++]=arr[i];
        }
        String r=String.join(" ",ans);
        return r;
    }
}