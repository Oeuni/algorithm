class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        for (int i = 0; i < box.length; i++) {
			while (box[i] % n != 0) {
				box[i]--;
			}
		}
        answer = (box[0]*box[1]*box[2]) / (n*n*n);
        return answer;
    }
}