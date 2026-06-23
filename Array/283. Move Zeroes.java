class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
            else{
                r++;
            }
        }
        while(r>0){
            list.add(0);
            r--;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}