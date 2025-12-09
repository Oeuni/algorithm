import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int[] A = new int[N];
		int[] sortA = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int ipt = Integer.parseInt(st.nextToken());
			A[i] = ipt;
			sortA[i] = ipt;
		}
		
		Arrays.sort(sortA);
		
		for (int i = 0; i < A.length; i++) {
			int chk = A[i];	// 찾을 숫자
			for (int j = 0; j < sortA.length; j++) {
				if (chk == sortA[j]) {
					sb.append(j + " ");
					sortA[j] = -1;
					break;
				}
			}
			
		}
		System.out.println(sb);
	}
}