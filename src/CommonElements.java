//https://practice.geeksforgeeks.org/problems/common-elements1132/1
import java.util.*;
public class CommonElements {
	public static void main(String[] args) {
		int A[] = {1, 5, 10, 20, 40, 80};
		int B[] = {6, 7, 20, 80, 100};
		int C[] = {3, 4, 15, 20, 30, 70, 80, 120};
		//int n1=6 ,n2=5, n3=8;
		
		int i = 0, j=0,k=0;
		while(i<A.length && j<B.length && k<C.length) {
			if(A[i]==B[j] && B[j]==C[k]) {
				System.out.println(A[i]);
				i++;
				j++;
				k++;
			}
			else if(A[i]<B[j])
				i++;
			else if(B[j]<C[k])
				j++;
			else
				k++;
		}
		
	}

}
