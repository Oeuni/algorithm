import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		// 자릿수 합 최대
		int max = s.length() * 9;
		
		// 정답
		int result = 0;
		
		for (int i = n-max; i < n; i++) {
			int sum = i;
			int a = i;
			
			// 각 자릿수 합 구하기
			while (a > 0) {
				sum += a % 10;
				a /= 10;
			}
			if (sum == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}