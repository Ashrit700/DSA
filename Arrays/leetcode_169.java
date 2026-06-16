class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
               map.put(arr[i] ,map.get(arr[i])+1);


            }
            else{
                map.put(arr[i],1);
            }
        }
        int val=0;
        for(int i=0;i<n;i++){
            if(map.get(arr[i])>n/2){
                 val=arr[i];
            }
        }
        return val;
        
    }
}