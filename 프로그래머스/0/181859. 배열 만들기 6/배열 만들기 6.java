import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
			if (stk.isEmpty()) {
				stk.add(arr[i]);
			}
			else if (stk.peek() == arr[i]) {
				stk.pop();
			}
			else {
				stk.add(arr[i]);
			}
		}

        int[] answer = stk.stream().mapToInt(i -> i).toArray();
        
        if (answer.length == 0) {
        	return new int[] { -1 };
        }

        return answer;
    }
}