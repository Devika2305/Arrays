//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
public class NextGreater {

	public static void main(String[] args) {

		int arr[] = {1,3,2,4};
		int n = arr.length;
		int next;
		for(int i = 0;i<n;i++) {
			next = -1;
			for(int j=i+1;j<n;j++) {
				
				if(arr[j]>arr[i]) {
					next = arr[j];
					break;
				}
			}
			System.out.print(next+" ");
		}
	}
}
