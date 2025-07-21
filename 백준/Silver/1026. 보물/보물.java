import java.util.*;

// 백준 - 1026:보물
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> list1 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}
		
		List<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list2.add(sc.nextInt());
		}
		
		int sum = 0;
		
		int min = 0;
		int max = 0;
		while (list1.size() != 0) {
			min = Collections.min(list1);
			max = Collections.max(list2);
			
			sum += min * max;
			list1.remove(Integer.valueOf(min));
			list2.remove(Integer.valueOf(max));
		}
		
		System.out.println(sum);
	}
}