class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
    
       int []dp=new int [arr.length+1];
       
       for(int i=arr.length-1;i>=0;i--){
        int len=0;
        int max=Integer.MIN_VALUE;
        int maxele=Integer.MIN_VALUE;
        


        for(int j=i;j<Math.min(i+k,arr.length);j++){
            len++;
            if(maxele<arr[j]){
                maxele=arr[j];
            }
            int sum=maxele*len+dp[j+1];
            max=Math.max(max,sum);
            

            
        }
        dp[i]=max;

       }
       return dp[0];
        
    }

}