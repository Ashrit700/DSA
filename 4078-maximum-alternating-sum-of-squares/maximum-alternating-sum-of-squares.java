// class Solution {
//     public long maxAlternatingSum(int[] nums) {
       
//        long[] squares=new long[nums.length];
//        for(int i=0;i<nums.length;i++){
//         squares[i]=(long)nums[i]*nums[i];

//        }
//        Arrays.sort(squares);
//        int left=0;
//        int right=nums.length-1;
//        long sum=0;

//        while(left<=right){
//        if(left==right){
//         sum=sum+squares[right];
//        }
//        else{
//         sum=sum+squares[right]-squares[left];
//         right--;
//         left++;
//        }
//        }
//        return sum;

        
//     }
// }


// import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squares = new long[n];
        
        // Step 1: Compute squares of all numbers (handling negatives cleanly)
        for (int i = 0; i < n; i++) {
            squares[i] = (long) nums[i] * nums[i];
        }
        
        // Step 2: Sort the squares in ascending order
        Arrays.sort(squares);
        
        long sum = 0;
        int left = 0;
        int right = n - 1;
        
        // Step 3: Greedily assign smaller squares to subtract, larger squares to add
        while (left <= right) {
            if (left == right) {
                // If one element remains, it goes to a positive slot (+)
                sum += squares[right];
                break;
            } else {
                // Subtract the smallest square at 'left' (-) 
                // and add the largest square at 'right' (+)
                sum = sum + squares[right] - squares[left];
                right--;
                left++;
            }
        }
        
        return sum;
    }
}