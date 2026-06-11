class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:arr)
            map.put(n,map.getOrDefault(n,0)+1);
        Set<Integer> key=map.keySet();
        Set<Integer> res=new HashSet<>();
        for(int k:key){
            if(!res.contains(map.get(k)))
                res.add(map.get(k));
            else
                return false;
        }
        return true;
    }
}