class Solution {
    public int longestOnes(int[] arr, int k) {
        int left=0;
        int maxlength=0;
      
        int l=k;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                l--;
            }
            while(l<0){
                if(arr[left]==0){
                    l++;
                }
                left++;
            }


           maxlength=Math.max(maxlength,i-left+1);
        }
        return maxlength;
        

    }
}