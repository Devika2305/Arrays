//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
import java.util.*;
public class Rotate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int a[] = new int[n];
		a[0] = arr[n-1];
		int c = 0;
		for(int i=1;i<n;i++) {
			a[i] = arr[c++];
		}
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
		sc.close();
	}

}
