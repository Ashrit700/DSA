class Solution {
    public boolean check(String s,String p){
        if(s.length()!=p.length()+1){
            return false;
        }
        int l=0;
        int r=0;
        while(l<s.length()&&r<p.length()){
            if(s.charAt(l)==p.charAt(r)){
                l++;
                r++;
            }
            else{
                l++;
            }
        }
       
        return r==p.length();
    }
    public int longestStrChain(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
                int[] dp=new int[arr.length];
      
        for(int i=0;i<arr.length;i++){
            dp[i]=1;
        

        }
        int last=0;
        int max=0;
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(check(arr[i],arr[j])&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                   

                }
            }
            if(dp[i]>max){
                max=dp[i];
               
            }
        }
        
       
        return max;
   

        
    }
}