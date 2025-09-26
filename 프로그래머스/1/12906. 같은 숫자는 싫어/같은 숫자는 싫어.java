import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
        	if (!stk.isEmpty() && stk.peek() == arr[i]) {
        		continue;
        	}
        	else {
        		stk.push(arr[i]);
        	}
		}
        int[] answer = new int[stk.size()];
        int i = 0;
        for (int val : stk) {
        	answer[i++] = val; // 순서 그대로
        }
        
        return answer;
    }
}