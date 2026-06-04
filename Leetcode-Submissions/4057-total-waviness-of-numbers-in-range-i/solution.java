class Solution {
    public int totalWaviness(int num1, int num2) {
        int score=0;
        for(int num = num1; num<=num2; num++){
            score+=findWaiveScore(num);
        } 
        return score;       
    }
    
    public int findWaiveScore(int num){
        String s = String.valueOf(num);
        int l=s.length();
        if(l<3){
            return 0;
        }

        int score=0;
        for(int i=1;i<=l-2;i++){
            char current = s.charAt(i);
            char prev = s.charAt(i - 1);
            char next = s.charAt(i + 1);

            // Peak
            if (current > prev && current > next) {
                score++;
            }

            // valley 
            if (current < prev && current < next) {
                score++;
            }
        }
        return score;
    }

}
