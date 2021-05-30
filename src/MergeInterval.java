//https://leetcode.com/problems/merge-intervals/
public class MergeInterval {
	public static void main(String args[]) {
		//int arr[][] = new int[4][2];
		int arr[][]= {{1,3},{2,6},{8,10},{15,18}};
		System.out.print("[");
		for(int i=0;i<4;i++) {
			System.out.print("[");
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+"  ");
	
			}
			System.out.print(" ]");
		}
		System.out.println("]");
		int b[][] = new int[4][2];
		for(int i=0;i<3;i++) {
			if(arr[i][1] > arr[i+1][0]) {
				b[i][0] = arr[i][0];
				b[i][1] = arr[i+1][1];
			}
			else {
				b[i][0] = arr[i+1][0];
				b[i][1] = arr[i+1][1];
			}
		}
		System.out.println("OUTPUT: ");
		for(int i=0;i<3;i++) {
			System.out.print("[");
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+"  ");
	
			}
			System.out.print(" ]");
			}
		System.out.print("]");
	}
}
