class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
         map.put('X',10);
          map.put('L',50);
           map.put('C',100);
            map.put('D',500);
        map.put('M',1000);
        int sum=0;
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++){
            if(i<str.length-1&&map.get(str[i])<map.get(str[i+1])){
                sum=sum-map.get(str[i]);
            }
            else{
                sum=sum+map.get(str[i]);
            }
        }
        


      return sum;  
    }
}