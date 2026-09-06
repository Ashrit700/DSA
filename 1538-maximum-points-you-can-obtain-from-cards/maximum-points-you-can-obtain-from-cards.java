class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
    
        int sum=0;
        int max=0;
        for(int j=0;j<=k-1;j++){
            sum=sum+arr[j];
        }
        max=Math.max(sum,max);
        for(int j=n-1;j>=(n-k);j--){
            sum=sum+arr[j]-arr[j-n+k];
         max=Math.max(sum,max);
        }

         return max;


    }

        
    }
