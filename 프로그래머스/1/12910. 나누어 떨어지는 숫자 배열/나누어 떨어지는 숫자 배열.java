import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
        // 비어있으면 -1 리턴
        if (list.isEmpty()) {
            return new int[] { -1 };
        }
        
        int[] answer = new int[list.size()];
        
        list.sort(null);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}