class Solution {
    public void sortColors(int[] arr) {
        int max=0;
        int[] sorted=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int[] count=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        for(int i=1;i<max+1;i++){
            count[i]=count[i]+count[i-1];

        }
        for(int i=arr.length-1;i>=0;i--){
            sorted[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sorted[i];
        }
        




        
    }
}