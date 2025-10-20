class Solution {
    public int solution(String my_string) {
    	int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
			int a = my_string.charAt(i)-'0';
        	if (a >= 0 && a < 10) {
        		answer += Integer.parseInt(my_string.charAt(i)+"");
        	}
		}
        return answer;
    }
}