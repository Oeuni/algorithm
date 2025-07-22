import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 백준 - 4153:직각삼각형
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		List<String> listAns = new ArrayList<String>();
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if (a == 0 && b == 0 && c == 0) break;

			int[] srt = {a, b, c};
			Arrays.sort(srt);
			
			if (srt[0]*srt[0] + srt[1]*srt[1] == srt[2]*srt[2]) {
				listAns.add("right");
			}
			else {
				listAns.add("wrong");
			}
		}
		
		for (String string : listAns) {
			System.out.println(string);
		}

	}
}