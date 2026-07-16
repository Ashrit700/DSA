class Solution {
    public void solve(List<List<Integer>> ans,List<Integer> li,int[] arr,int n,int index){
        ans.add(new ArrayList<>(li));
        for(int i=index;i<n;i++){
            if(i!=index&&arr[i]==arr[i-1])continue;
            li.add(arr[i]);
            solve(ans,li,arr,n,i+1);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        Arrays.sort(nums);
        solve(ans,li,nums,nums.length,0);
        return ans;
        
    }
}