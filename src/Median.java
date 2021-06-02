//https://practice.geeksforgeeks.org/problems/find-the-median0527/1
import java.util.Arrays;
public class Median {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		Arrays.sort(arr);
		int med;
		if(n%2 == 0) {
			med = (arr[(n/2)-1] + arr[n/2]) / 2;
		}
		else {
			med = arr[(n)/2];
		}
		System.out.println(med);

	}

}
