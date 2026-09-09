class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
    public int solve(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }

           
                count=count+(i-l+1);
                }
            

        

        return count;
        

    }
}