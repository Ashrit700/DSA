class Solution {
    public int[][] insert(int[][] arr, int[] num) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        int n=arr.length;
       int i=0;
       while(i<n&&arr[i][1]<num[0]){
        ArrayList<Integer>ne=new ArrayList<>();
        ne.add(arr[i][0]);
        ne.add(arr[i][1]);
        list.add(ne);
        i++;
       }
       while(i<n&&arr[i][0]<=num[1]){
        num[0]=Math.min(num[0],arr[i][0]);
        num[1]=Math.max(num[1],arr[i][1]);
        i++;
       }
       ArrayList<Integer>nee=new ArrayList<>();
        nee.add(num[0]);
        nee.add(num[1]);
        list.add(nee);
        while(i<n){
        ArrayList<Integer>ne=new ArrayList<>();
        ne.add(arr[i][0]);
        ne.add(arr[i][1]);
        list.add(ne);
        i++;

        }
        int[][] result=new int[list.size()][2];
        for(int k=0;k<list.size();k++){
            result[k][0]=list.get(k).get(0);
            result[k][1]=list.get(k).get(1);

        }
        return result;

        
    }
}