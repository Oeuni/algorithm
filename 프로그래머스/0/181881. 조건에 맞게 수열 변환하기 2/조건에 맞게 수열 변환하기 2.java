import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] prev = new int[arr.length];

        while (true) {
        	prev = Arrays.copyOf(arr, arr.length);
        	
            for (int i = 0; i < arr.length; i++) {
    			if (arr[i] >= 50 && arr[i] % 2 == 0) { 		// 50보다 크거나 같은 짝수
    				arr[i] /= 2;
    			}
    			else if (arr[i] < 50 && arr[i] % 2 == 1) {	// 50보다 작은 홀수
    				arr[i] = arr[i] * 2 + 1;
    			}
    		}
            answer++;
            if (Arrays.equals(arr, prev)) {
            	return answer-1;
            }
        }
    }
}