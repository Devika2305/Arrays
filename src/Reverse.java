//https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t= s.nextInt();
		s.nextLine();
		while(t-->0) {
			String str=s.nextLine();
			System.out.println(reverse(str));
		s.close();
		}
	}
	static String reverse(String str) {
		int n=str.length();
		if(n==0)
			return "";
		return (str.charAt(n-1)+reverse(str.substring(0,n-1)));
		
	}
	


}
