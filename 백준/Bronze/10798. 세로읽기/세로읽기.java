import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[5];
		int maxLeng = 0;
		
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
			if (s[i].length() > maxLeng) maxLeng = s[i].length();
		}

		String answer = "";
		
		for (int i = 0; i < maxLeng; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[j].length() > i) {
					answer += s[j].charAt(i);
				}
			}
		}
		
		System.out.println(answer);
	}
}