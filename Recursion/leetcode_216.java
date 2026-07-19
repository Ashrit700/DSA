class Solution {
    public void solve(int[] arr,int index,int sum,List<List<Integer>> ans,List<Integer>li,int target,int number){
        if(sum==target&&li.size()==number){
            ans.add(new ArrayList<>(li));
            return;
        }
        if(sum>target||index==arr.length||li.size()>number){
            return;
        }
        li.add(arr[index]);
        solve(arr,index+1,sum+arr[index],ans,li,target,number);
        li.remove(li.size()-1);
        solve(arr,index+1,sum,ans,li,target,number);

    }
    public List<List<Integer>> combinationSum3(int k, int number) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        solve(arr,0,0,ans,li,number,k);
        return ans;

        
    }
}