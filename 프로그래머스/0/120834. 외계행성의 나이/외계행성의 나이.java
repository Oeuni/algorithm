class Solution {
    public String solution(int age) {
        String answer = "";
        String temp = age + "";

        int a = 1;
        for (int i = 1; i < temp.length(); i++) {
			a *= 10;
		}
        for (int i = 0; i < temp.length(); i++) {
        	answer += (char)(97 + (age / a));
        	age %= a;
        	a /= 10;
        }
        return answer;
    }
}