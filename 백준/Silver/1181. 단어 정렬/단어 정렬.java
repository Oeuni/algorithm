import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (!list.contains(s)) list.add(s);
		}
		
		list.sort((s1, s2) ->
		s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length());
		
		for (String str : list) {
			System.out.println(str);
		}
	}
}