class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String temp = order+"";
        for (int i = 0; i < temp.length(); i++) {
        	int n = temp.charAt(i)-'0';
			if (n != 0 && n % 3 == 0) {
				answer++;
			}
		}
        return answer;
    }
}