class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr==null||arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
       int count=0;
       int longest=1;
       int last_small=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==last_small+1){
            count++;
            last_small=arr[i];

        }
        else if(arr[i]!=last_small){
            count=1;
            last_small=arr[i];
        }
        longest=Math.max(longest,count);
       }
       return longest;
        
    }
}