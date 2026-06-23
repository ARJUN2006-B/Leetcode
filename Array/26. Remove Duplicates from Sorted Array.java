class Solution {
    public int removeDuplicates(int[] nums) {
        Integer[] arr =new Integer[nums.length];
        int count=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(arr[j] != null && arr[j]==nums[i]){
                    count=-1;
                }
            }
            if(count!=-1){
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        return k;
    }
}