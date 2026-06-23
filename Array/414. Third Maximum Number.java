class Solution {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> map=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int[] ok=new int[map.size()];
        int j=0;
        for(int x:map){
            ok[j]=x;
            j++;
        }
        Arrays.sort(ok);
        int size=map.size();
        if(size<3){
            return ok[ok.length-1];
        }
        return ok[ok.length-3];
    }
}