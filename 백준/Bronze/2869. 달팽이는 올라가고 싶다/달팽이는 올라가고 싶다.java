import java.util.Scanner;

// 백준 - 2869:달팽이는 올라가고 싶다
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int x = v-b;
		int y = a-b;
		int day = 0;
		
		if (x % y != 0) {
			day = x / y + 1;
		}
		else {
			day = x / y;
		}
		System.out.println(day);
	}
}