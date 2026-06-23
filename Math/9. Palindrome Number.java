class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        List<Integer> list=new ArrayList<>();
        while(x>0){
            list.add(x%10);
            x=x/10;
        }
        int size=list.size()/2;
        int k=list.size()-1;
        for(int i=0;i<size;i++){
             if(list.get(i)!=list.get(k)){
                return false;
             }
             k--;
        }
        return true;
    }
}