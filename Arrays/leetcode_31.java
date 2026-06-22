class leetcode_31 {
    public void swap(int[] nums,int i,int j){
        int k=nums[i];
        nums[i]=nums[j];
        nums[j]=k;
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start++,end--);
        }
    }
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
        int ind=-1;
        int i;
        for( i=k;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;

            }
        }
        if(i>=0){
            int j=nums.length-1;

            while(nums[j]<=nums[i]){
                j--;

            }
            
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        
    }
}