class Solution {
    int[][][]dp;
    public int solve(int i,int j1,int j2,int[][] grid){
        int m=grid[0].length;
        int n=grid.length;
        if(j1<0||j2<0||j1>=m||j2>=m){
            return Integer.MIN_VALUE;

        }
        if(i==n-1){
            if(j1==j2){
                return grid[i][j1];
            }
            else{
                return grid[i][j1]+grid[i][j2];
            }
        }
        if(dp[i][j1][j2]!=-1){
            return dp[i][j1][j2];
        }
        int max=0;
        int value=0;
        for(int x=-1;x<2;x++){
            for(int y=-1;y<2;y++){
                if(j1==j2){
                    value=grid[i][j1]+solve(i+1,j1+x,j2+y,grid);
                }
                else{
                    value=grid[i][j1]+grid[i][j2]+solve(i+1,j1+x,j2+y,grid);
                }
                max=Math.max(max,value);
            }
        }
        dp[i][j1][j2]=max;
        return max;
    }
    public int cherryPickup(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
    dp=new int[n][m][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            Arrays.fill(dp[i][j],-1);
        }
    }
    return solve(0,0,m-1,grid);
        
    }
}