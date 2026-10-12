class Solution {
    public int findNumberOfLIS(int[] arr) {


        
        int[] dp=new int[arr.length];
        int [] count=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=1;
            count[i]=1;

        }
        int result=0;
        int max=0;
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    count[i]=count[j];

                }
                else if(arr[i]>arr[j]&&dp[i]==dp[j]+1){
                    count[i]=count[j]+count[i];
                }
            }
            if(dp[i]>max){
                max=dp[i];
                
            }
        }
      for(int i=0;i<arr.length;i++){
        if(max==dp[i]){
            result=count[i]+result;
        }
      }
      return result;
       
   
  
        
    }
}