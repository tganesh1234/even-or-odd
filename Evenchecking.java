package gani.assignments;

import java.util.Scanner;

public class Evenchecking {

	public static void main(String[] args) {
		// check given number is even or not
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		n=sc.nextInt();
		if (n%2==0) {
			System.out.println(n+" is a even number.");
		}else {
			System.out.println(n+" is a odd number.");
		}sc.close();
	}

}
