class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=nums1.length-1;
        int right=nums2.length-1;
        
        while(left>=0 && right>=0){
            if(nums1[left]==nums2[right]){
                list.add(nums1[left]);
                left--;
                right--;
 
            }
            else if(nums1[left]>nums2[right]){
                left--;
            }
            else if(nums1[left]<nums2[right]){
                right--;
            }
        }
        int[] arr=new int[list.size()];
        int i=0;
        for(int x:list){
           arr[i++]=x;
        }
        return arr;
    }
}