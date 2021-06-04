//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuySellStock {
	public static void main(String args[]) {
		int arr[] = {7,1,5,3,6,4};
		int n = arr.length;
		int min = arr[0];
		int profit;
		int max_profit = 0;
		for(int i=0;i<n;i++) {
			min = Math.min(min,arr[i]);
			profit = arr[i] - min;
			max_profit = Math.max(max_profit, profit);
		}
		System.out.println("Max Profit: "+max_profit);
	}
}
