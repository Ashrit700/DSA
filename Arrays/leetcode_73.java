//method 1 bakwass 
class Solution{
    public static void setZeroes(int[][] arr){
        int [] [] copy=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                copy[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(copy[i][j]==0){
                    for(int k=0;k<arr[0].length;k++){
                        arr[i][k]=0;
                    }
                    for(int k=0;k<arr.length;k++){
                        arr[k][j]=0;
                    }
                }
            }
        }

    }
}
class leetcode_73{
    
    public void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1. Check if first row has any zero
        for (int j = 0; j < m; j++) {
            if (arr[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // 2. Check if first column has any zero
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // 3. Use first row and col as markers for the rest of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // 4. Update the inner matrix based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // 5. Finally, handle the first row and column
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                arr[0][j] = 0;
            }
        }
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                arr[i][0] = 0;
            }
        }
    }

}