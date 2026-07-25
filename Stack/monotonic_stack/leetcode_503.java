class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int [] nums2=new int [2*nums.length];
        int j=0;
        int [] arr=new int[nums2.length];
        
        for(int i=0;i<nums2.length;i++){
            nums2[i]=nums[j];
            j=(j+1)%nums.length;

        }

        for(int i=nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(nums2[i]);
                arr[i]=-1;
            }
            else{
            while(!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i]=-1;
            }
            else{
            arr[i]=stack.peek();
            }
            stack.push(nums2[i]);
            }

        }
        int [] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]=arr[i];

        }
        return result;
        
        
    }
}