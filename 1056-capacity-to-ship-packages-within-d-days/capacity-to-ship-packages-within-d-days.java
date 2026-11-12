class Solution {
    public int check(int[] arr,int capacity){
        int day=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=count+arr[i];
            
            if(count>capacity){
                count=arr[i];
                day++;

            }


        }
        return day;

    }
    public int shipWithinDays(int[] weights, int days) {
        int minCapacity=0;
        int maxCapacity=0;
        for(int i=0;i<weights.length;i++){
            maxCapacity=maxCapacity+weights[i];
             if(weights[i]>minCapacity){
                minCapacity=weights[i];
            }
        }
        int low=minCapacity;
        int high=maxCapacity;
        int ans=0;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}