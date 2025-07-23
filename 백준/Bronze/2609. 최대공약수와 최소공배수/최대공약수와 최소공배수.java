import java.util.Scanner;

// 백준 - 2609:최대공약수와 최소공배수
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int small = Math.min(a, b);

		if (small != 0) {
			int max = 0;	// 최대공약수
			int min = 0;	// 최소공배수
			for (int i = small; i > 0 ; i--) {
				if (a % i == 0 && b % i == 0) {
					max = i;
					break;
				}
			}
			
			// 최소공배수 = a*b / 최대공약수
			min = a*b / max;
			
			System.out.println(max);
			System.out.println(min);
		}
	}
}