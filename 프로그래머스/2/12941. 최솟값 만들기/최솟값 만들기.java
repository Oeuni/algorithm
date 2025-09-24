import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Integer[] boxed = new Integer[B.length];
        
        for (int i = 0; i < boxed.length; i++) {
        	boxed[i] = B[i];
		}
        
        Arrays.sort(A);
        
        Arrays.sort(boxed, Collections.reverseOrder());
        
        for (int i = 0; i < boxed.length; i++) {
			answer += A[i] * boxed[i];
		}

        return answer;
    }
}