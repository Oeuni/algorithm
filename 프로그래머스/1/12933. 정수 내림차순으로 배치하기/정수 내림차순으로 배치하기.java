import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String str = n+"";
        Integer[] arr = new Integer[str.length()];
        for (int i = 0; i < str.length(); i++) {
			arr[i] = Integer.parseInt(str.charAt(i)+"");
		}
        Arrays.sort(arr, Collections.reverseOrder());
        str = "";
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
        return Long.parseLong(str);
    }
}