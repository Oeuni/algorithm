import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// 백준 - 1269:대칭 차집합
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setACp = new HashSet<>();
		for (int i = 0; i < a; i++) {
			int x = sc.nextInt();
			setA.add(x);
			setACp.add(x);
		}
		
		Set<Integer> setB = new HashSet<>();
		for (int i = 0; i < b; i++) {
			setB.add(sc.nextInt());
		}
		
		Set<Integer> chaA_B = new HashSet<>();
		setA.removeAll(setB);
		
		Set<Integer> chaB_A = new HashSet<>();
		setB.removeAll(setACp);
		
		System.out.println(setA.size() + setB.size());
	}
}