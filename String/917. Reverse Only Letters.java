class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ok=s.toCharArray();
        
        int k=ok.length-1;
        char[] re=new char[ok.length];
        
        for(int i=0;i<ok.length;i++){
             if(!Character.isLetter(ok[i])){
                re[i]=ok[i];
             }
             else {
                while(k >= 0 && !Character.isLetter(ok[k])){
        k--;
    }
               re[i]=ok[k];
               k--;
             }
        }
        s=new String(re);
        return s;
    }
}