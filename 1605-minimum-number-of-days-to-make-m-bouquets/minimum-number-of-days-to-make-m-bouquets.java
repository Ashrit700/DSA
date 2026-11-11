class Solution {
    public int check(int[] arr,int m,int k,int mid){
        int count=0;
        int number=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                number=number+count/k;

                count=0;
            }
        }
        number=number+(count/k);
        return number;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
            if(bloomDay[i]>max){
                    max=bloomDay[i];
            }

        }
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(bloomDay,m,k,mid)>=m){
                ans=mid;
            high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return ans;


        
    }
}