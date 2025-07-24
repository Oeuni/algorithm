import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public int[] solution(int[] arr, int k) {
    	int[] temp = new int[k];
        int[] answer = new int[k];
        
        Set<Integer> hs = new LinkedHashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
			hs.add(arr[i]);
		}
        
        temp = hs.stream().limit(k).mapToInt(i -> i).toArray();
        answer = Arrays.copyOf(temp, k);
        
        if (hs.size() < k) {
            for (int i = hs.size(); i < answer.length; i++) {
    			answer[i] = -1;
    		}
        }

        return answer;
    }
}