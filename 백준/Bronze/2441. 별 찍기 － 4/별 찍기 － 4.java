import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) { // i <= a → i < a
			for (int j = 0; j < i; j++) { // 공백 출력
				System.out.print(" ");
			}
			for (int j = i; j < a; j++) { // 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
