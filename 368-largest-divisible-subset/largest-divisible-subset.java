class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        Arrays.sort(arr);
        int[] dp=new int[arr.length];
        int [] hash=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=1;
            hash[i]=i;

        }
        int last=0;
        int max=0;
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    hash[i]=j;

                }
            }
            if(dp[i]>max){
                max=dp[i];
                last=i;
            }
        }
        int index=last;
        while(hash[index]!=index){
            a.add(arr[index]);
            index=hash[index];
        }
        a.add(arr[index]);
        Collections.reverse(a);
        return a;
   
        
    }
}