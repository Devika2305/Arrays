//https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
public class count_pairs {
	public static void main(String[] args) {
		int arr[] = {1,1,1,1};
		int n = arr.length;
		int k=2;
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j] == k)
					c++;
				System.out.println(arr[i]+" , "+arr[j]);
			}
		}
		System.out.println(c);
	}

}
