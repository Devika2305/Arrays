// Using summation formula
// sum of first n natural nos = n*(n+1)/2
public class Missing_Element {

	static void  find(int arr[]) {
		int N = 8;
		int sum = N*(N+1)/2;
		for(int i = 0;i<arr.length;i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing element = "+sum);
	}
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,6,7,8};
		find(arr);
	}

}
