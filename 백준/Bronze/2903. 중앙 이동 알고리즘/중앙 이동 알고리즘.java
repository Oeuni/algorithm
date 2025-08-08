import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1, x = 1;
		
		for (int i = 0; i < n; i++) {
			m *= 2;
			x *= 4;
		}
		
		System.out.println(m*2+1+x);
	}
}