class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            while(map.size()>2){
                int count=map.get(fruits[left])-1;
                map.put(fruits[left],count);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);

                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
        
    }
}