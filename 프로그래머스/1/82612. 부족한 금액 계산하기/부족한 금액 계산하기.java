class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long temp = 0;
        for (int i = 0; i < count; i++) {
        	temp += price;
			answer += temp;
		}
        return answer <= money ? 0 : answer-money;
    }
}