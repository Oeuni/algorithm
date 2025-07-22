import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// 백준 - 1427:소트인사이드
public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = a + "";
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < b.length(); i++) {
			list.add(Integer.parseInt(b.charAt(i)+""));
		}
		
		list.sort(Comparator.reverseOrder());
		
		b = "";
		
		for (int i = 0; i < list.size(); i++) {
			b += list.get(i);
		}
		
		System.out.println(Integer.parseInt(b));
	}
}