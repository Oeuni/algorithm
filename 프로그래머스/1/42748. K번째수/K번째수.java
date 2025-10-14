import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
        	int start = commands[i][0]-1;
        	int end = commands[i][1]-1;
        	
        	if (start == end) {
        		answer[i] = array[start];
        	}
        	else {
        		int[] sliced = Arrays.stream(array).skip(start).limit(end - start + 1).sorted().toArray();
        		
        		answer[i] = sliced[(commands[i][2])-1];
        	}
		}
        return answer;
    }
}