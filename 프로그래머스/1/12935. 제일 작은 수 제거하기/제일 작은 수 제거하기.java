import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
			list.add(n);
		}
        
    	for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
    	list.remove(Integer.valueOf(min));
    	
    	for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer.length == 0 ? new int[] {-1} : answer;
    }
}