import java.util.Scanner;

public class PrintAllSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=4;
		int arr[]= {1,2,3,4};
		System.out.println("Output");
			                                                          
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		} 		
		sc.close();
	}
}
