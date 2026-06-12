import java.util.*;
public class matrixmult{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] []arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }

       }
       int k=sc.nextInt();
       int l=sc.nextInt();
       int [][] arr2=new int[k][l];
       for(int i=0;i<k;i++){
        for(int j=0;j<l;j++){
            arr2[i][j]=sc.nextInt();
        }
       }
       int [] [] ans=new int[n][l];
       for(int i=0;i<n;i++){
        for(int j=0;j<l;j++){
            int sum=0;
            for(int p=0;p<m;p++){
                sum=sum+arr[i][p]*arr2[p][j];

            }
            ans[i][j]=sum;
        }
       }
       for(int i=0;i<n;i++){
        for(int j=0;j<l;j++){
            System.out.print(ans[i][j]+" ");
        }
        System.out.println();
       }




    }
}
