class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] start=new int[n];
        int [] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int max=0;
        int count=0;
        int ind=0;

        for(int i =0;i<n;i++){
            if(start[i]<=end[ind]){
                count++;
                
            }
            else{
                
                ind++;
            }
            max=Math.max(max,count);

        }
        return count;
    }
}