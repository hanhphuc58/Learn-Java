import java.util.HashSet;
import java.util.Set;

public class Bai_8_1 {
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(8);
		
		System.out.println(set);
	}
}
