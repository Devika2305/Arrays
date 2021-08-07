// Using HashSet
import java.util.HashSet;
public class Duplicate {

	public static void main(String[] args) 
	{
		int arr[]= {3,1,3,4,2,5,1,9,9};
		HashSet<Integer> s = new HashSet<Integer>();
		for (int el : arr) {
			if (s.contains(el)) 
				System.out.println(el);
			s.add(el);
		}
	}
}
