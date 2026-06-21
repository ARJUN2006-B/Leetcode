class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<=max+1;i++){
            if(!list.contains(i)){
                return i;
            }
        }
        return 0;
    }
}