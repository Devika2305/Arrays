//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
import java.util.*;
public class Subset_Array {
	public static void main(String[] args) {
		int A[] = {11,1,13,21,7,3};
		int B[] = {11,3,7,1};
		HashSet<Integer> s = new HashSet<>();
		for(int el : A) {
			s.add(el);
		}
		int size = s.size();
		for(int el: B) {
			s.add(el);
		}
		if(s.size() == size)
			System.out.println("Yes Array B is subset of Array A");
		else
			System.out.println("No Array B is not a subset of Array A");
	}

}
