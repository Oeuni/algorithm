import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

// 백준 - 17219:비밀번호 찾기
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] parts = bf.readLine().split(" ");
		int n = Integer.parseInt(parts[0]);	// 총 사이트 주소 수
		int m = Integer.parseInt(parts[1]);	// 비밀번호 찾을 사이트 주소 수
		
		String[] nArr = new String[n];
		
		HashMap<String, String> hm = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			String[] line = bf.readLine().split(" ");
			hm.put(line[0], line[1]);
		}

		String key = "";
		for (int i = 0; i < m; i++) {
			key = bf.readLine();
			sb.append(hm.get(key)).append("\n");
		}
		
		bw.write(sb.toString());
        bw.flush();
        bw.close();
	}
}