import java.util.Scanner;

// 백준 - 2587:대표값2
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int n = 0;
		int avg = 0;
		for (int i = 0; i < 5; i++) {
			n = sc.nextInt();
			arr[i] = n;
			avg += n;
		}

		avg /= 5;
		int min = 100;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
			min = 100;
		}
		System.out.println(avg);
		System.out.println(arr[2]);
	}
}