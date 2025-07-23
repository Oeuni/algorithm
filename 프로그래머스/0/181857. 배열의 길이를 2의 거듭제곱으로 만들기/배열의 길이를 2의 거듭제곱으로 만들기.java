import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        int x = 1;
        
        while (true) {
        	if (arr.length <= x) break;
        	x *= 2;
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int num : arr) {
            list.add(num);
        }
        
        for (int i = list.size(); i < x; i++) {
			list.add(0);
		}
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}