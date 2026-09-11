class Solution {
    public int totalNumbers(int[] digits) {
        int [] nums=new int[10];
        int count=0;
        for(int i=0;i<digits.length;i++){
            nums[digits[i]]++;
        }
        
        for(int j=100;j<=999;j=j+2){
            int[] c=new int[10];
            int d1=j%10;
            int d2=j/100;
            int d3=(j/10)%10;
            c[d1]++;
            c[d2]++;
            
            c[d3]++;
            if(nums[d1]>=c[d1]&&nums[d2]>=c[d2]&&nums[d3]>=c[d3]){
                count++;
            }

            
        }
        return count;
        
    }
}