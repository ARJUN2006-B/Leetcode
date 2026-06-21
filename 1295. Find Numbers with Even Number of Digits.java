class Solution {
    public int findNumbers(int[] nums) {
        int re=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int r=0;
            while(temp>0){
                temp=temp/10;
                r++;
            }
            if(r%2==0){
                re++;
            }
        }
        return re;
    }
}