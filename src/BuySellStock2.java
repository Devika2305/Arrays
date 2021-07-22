//Leetcode
//We can make infinite transactions		**No two stocks can be bought simultaneously; after buying one stock you have to sell the the stock first
public class BuySellStock2 {

	static int Profit(int arr[], int N) {
		int pro = 0;
		for(int i =1;i<N;i++) {
			if(arr[i] > arr[i-1]) {
				pro += arr[i]-arr[i-1];
				System.out.println("Bought at = "+arr[i-1]);
				System.out.println("Sold at = "+arr[i]);
			}
		}
		return pro;
	}
	public static void main(String[] args) {
		int arr[] = {5,2,6,1,4,7,3,6};
		int N = arr.length;
		System.out.println("Maximum Profit = "+Profit(arr,N));

	}

}
