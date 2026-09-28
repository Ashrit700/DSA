class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>=t*k){
            count++;
        }
        // int m=sum;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i]-arr[i-k];
            // m=Math.max(m,sum);
            if(sum>=t*k){
                count++;
            }
        }
        return count;
    }
}