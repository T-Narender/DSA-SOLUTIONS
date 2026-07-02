class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hm = new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((w1,w2)->{
            int f1=hm.get(w1);
            int f2=hm.get(w2);
            if(f1!=f2){
                return f1-f2;
            }
            return w2.compareTo(w1);
        });

        for(String word: hm.keySet()){
            pq.add(word);

            if(pq.size()>k){
                pq.poll();
            }
        }

        List<String> res= new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }

        Collections.reverse(res);
        return res;
    }
    
}
