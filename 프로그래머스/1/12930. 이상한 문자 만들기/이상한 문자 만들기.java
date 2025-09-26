class Solution {
    public String solution(String s) {
        String answer = "";
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += ' ';
				n = 0;
				continue;
			}
			if (n % 2 == 0) {
				answer += (s.charAt(i)+"").toUpperCase();
			}
			else {
				answer += (s.charAt(i)+"").toLowerCase();
			}
			n++;
		}
        return answer;
    }
}