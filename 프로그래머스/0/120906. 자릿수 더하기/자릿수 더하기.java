class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = n+"";
        int temp = 0;
        
        for (int i = 0; i < s.length(); i++) {
        	temp = n;
            while (temp > 10) {
            	temp %= 10;
            }
            n /= 10;
            answer += temp;
		}
        return answer;
    }
}