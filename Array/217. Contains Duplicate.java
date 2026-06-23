class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        if(hash.size()!=nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}