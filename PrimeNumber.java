package proj1;

import java.util.*;


public class PrimeNumber {
     
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		
		int i,test = 0,m = 0;
		m = n/2;
		
		if(n==0 || n==1) {
			System.out.println(n +" Not a Prime Number");
		}else {
			for(i=2; i <= m; i++) {
				if(n % i == 0) {
					System.out.println(n + " Not a Prime Number");
				test=1;
				break;
				}
			}
			
		if(test == 0) {
			System.out.println(n + " is a Prime Number");
		}
		}
	}
}
