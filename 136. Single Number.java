class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            k=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j] &&i!=j){
                    k++;
                }
            }
            if(k==0){
                ans=nums[i];
                return ans;
            }
        }
        return ans;
    }
}