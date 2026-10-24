class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] dp=new int[numRows+1][numRows+1];
        int n=numRows+1;
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if((j-1)>=0){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
                
            }
        }
        List<List<Integer>>li=new ArrayList<>();
        for(int i=1;i<n;i++){
            List<Integer>li1=new ArrayList<>();
            for(int j=0;j<i;j++){
                li1.add(dp[i][j]);

            }
            li.add(li1);
        }
        return li;
        
    }
}