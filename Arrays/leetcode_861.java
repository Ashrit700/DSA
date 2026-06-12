class Solution {
    public int matrixScore(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        // making rows first 0 to 1
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        //flipping columns where (no of 0 >no of 1s)

        for(int j=1;j<n;j++){
            int z=0;
            int o=0;
            for(int i=0;i<m;i++){
                if(arr[i][j]==0) z++;
                else o++;

            }
            if(z>o){
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;

                }
            }
        }
        int score =0;
        int x=1;
        for(int j=n-1;j>0;j--){
            for(int i=0;i<m;i++){
                score=score+(arr[i][j]*x);


            }
            x*=2;

        }
        return score;

        
    }
}