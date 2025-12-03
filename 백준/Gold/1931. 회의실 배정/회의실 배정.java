import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] meetTime = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				meetTime[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(meetTime, (a, b) -> {
		    if (a[1] == b[1]) {
		        return a[0] - b[0];   // 끝 시간이 같으면 시작 빠른 것 우선
		    }
		    return a[1] - b[1];       // 끝 시간 기준
		});

		int end = 0;
		int answer = 0;
		
		for (int i = 0; i < meetTime.length; i++) {
			if (meetTime[i][0] >= end) {
				end = meetTime[i][1];
				answer++;
			}
		}
		System.out.println(answer);
	}
}