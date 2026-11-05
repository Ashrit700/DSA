class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
        int max=0;

        for(int i=0;i<trips.length;i++){
            if(max<trips[i][2]){
                max=trips[i][2];
            }

        }
        int[] arr=new int[max+1];
        int prev=0;
        for(int i=0;i<trips.length;i++){
            arr[trips[i][1]]=arr[trips[i][1]]+trips[i][0];
            arr[trips[i][2]]=arr[trips[i][2]]-trips[i][0];
            // prev=arr[trips[i][1]];

        }
        for(int i=0;i<max+1;i++){
            if(arr[i]>capacity){
                return false;
            }
            if(i!=0){
            arr[i]=arr[i]+arr[i-1];
            if(arr[i]>capacity){
                return false;
            }

            }
            // System.out.println(arr[i]);
            // if(arr[i]>capacity){
            //     return false;
            // }
            

        }
        // for(int i=1;i<max+1;i++){
        //     System.out.println(arr[i]);
        //     // arr[i]=arr[i]+arr[i-1];
            

        // }
        if(arr[max]<0){
            return false;
        }
        return true;
        
    }
}