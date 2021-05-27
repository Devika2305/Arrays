//https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1
import java.util.*;
public class Union_Intersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		System.out.println("Enter size of first array: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements of first array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array: ");
		m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Enter elements of second array: ");
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		Union_Intersection obj=new Union_Intersection();
		obj.union(a, b, n, m);
		obj.intersection(a, b, n, m);	
		sc.close();
	}
	void union(int a[], int b[],int n,int m) {
		HashSet<Integer> un=new HashSet<>();
		for(int i=0;i<n;i++)
			un.add(a[i]);
		for(int i=0;i<m;i++)
			un.add(b[i]);
		System.out.println("Union of arrays: ");
		for(int el:un)
			System.out.print(el+" ");
		System.out.println();
	}
	void intersection(int a[],int b[],int n,int m) {
		HashSet<Integer> in = new HashSet<>();
		int i=0;int j=0;
		while(i<n && j<m) {
			if(a[i]< b[j])
				i++;
			else if(a[i]>b[j])
				j++;
			else {
				in.add(a[i]);
				i++;
				j++;
			}
		}
		System.out.println("Intersection of arrays: ");
		for(int el:in)
			System.out.print(el+" ");
	}

}







