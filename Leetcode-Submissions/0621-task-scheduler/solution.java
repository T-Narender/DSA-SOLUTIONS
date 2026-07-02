class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c: tasks){
            freq[c-'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<26;i++){
            if(freq[i] > 0){
                pq.offer(freq[i]);
            }
        }

        int time=0;
        while(!pq.isEmpty()){
            int cycle=n+1;
            List<Integer> store = new ArrayList<>();
            int taskCnt=0;
            while(cycle-- >0 && !pq.isEmpty()){
                int currFreq = pq.poll();
                if(currFreq > 1){
                    store.add(currFreq-1);
                }
                taskCnt++;
            }

            store.forEach(pq::offer);
            time+=(pq.isEmpty() ? taskCnt : n+1);
            
        }
        return time;
    }
}
