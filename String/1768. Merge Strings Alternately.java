class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr=word1.toCharArray();
        char[] brr=word2.toCharArray();
        char[] crr=new char[arr.length+brr.length];
        int j=0;int k=0;
        int i=0;
        while(j<arr.length && k<brr.length){
        crr[i++]=arr[j++];
        crr[i++]=brr[k++];
    }

    while(j<arr.length){
        crr[i++]=arr[j++];
    }

    while(k<brr.length){
        crr[i++]=brr[k++];
    }
        String s=new String(crr);
        return s;
    }
}