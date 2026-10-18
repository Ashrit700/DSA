class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            min=Math.min(arr[i],min);
            profit=Math.max(profit,arr[i]-min);

        }
        return profit;
        
    }
}