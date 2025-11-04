class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String temp = num+"";

    	for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
    		if (c - '0' == k) {
    			return i+1;
    		}
		}
        return answer;
    }
}