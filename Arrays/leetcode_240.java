class leetcode_240{
    public boolean searchMatrix(int[][] matrix,int target){
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        while(i<m&&j>=0){
            if(arr[i][j]==target)return true;
            else if(arr[i][j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
}