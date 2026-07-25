class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        int max=0;
        for(int i=0;i<nums2.length;i++){
            if(max<nums2[i]){
                max=nums2[i];
                
            }

        }
        int [] arr=new int[max+1];

        for(int i=nums2.length-1;i>=0;i--){
            if(stack.isEmpty()){
                stack.push(nums2[i]);
                arr[nums2[i]]=-1;
            }
            else{
            while(!stack.isEmpty()&&stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[nums2[i]]=-1;
            }
            else{
            arr[nums2[i]]=stack.peek();
            }
            stack.push(nums2[i]);
            }

        }
        int [] result=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i]=arr[nums1[i]];

        }
        return result;
        
    }
}