import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] arrA = new int[N];
		for (int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(br.readLine());
 		}
		
		int answer = 0;
		for (int i = arrA.length-1; i >= 0; i--) {
			if (arrA[i] <= K) {
				answer += K / arrA[i];
				K %= arrA[i];
			}
		}
		System.out.println(answer);
	}
}