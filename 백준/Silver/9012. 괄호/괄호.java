import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int left = 0;
		int right = 0;
		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
					
				if(s.charAt(j) == '(') {
					left++;
				}
				else {
					right++;
				}
				if(left < right) {
					break;
				}
			}
			if(left == right) {
				sb.append("YES\n");
			}
			else {
				sb.append("NO\n");
			}
			left = 0;
			right = 0;
		}
		System.out.println(sb);
	}
}