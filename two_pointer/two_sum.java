class two_sum {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<=j&&i<numbers.length&&j>=0){
            if(numbers[i]+numbers[j]==target){
               break;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }
        }
        int []ans={i+1,j+1};
        return ans;
        
    }
}
