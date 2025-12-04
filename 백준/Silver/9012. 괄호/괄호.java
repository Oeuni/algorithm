import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			Stack<String> stk = new Stack<>();
			String s = br.readLine();
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == '(') {
					stk.add("(");
				}
				else if (s.charAt(j) == ')' && stk.contains("(")) {
					stk.pop();
				}
				else {	// 빈 상태라면 그냥 넣음
					stk.add(")");
				}
			}
			if (stk.isEmpty()) {
				sb.append("YES\n");
			}
			else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}
}