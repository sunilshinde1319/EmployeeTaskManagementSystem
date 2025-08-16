package in.sp.demo;

import java.util.Iterator;
import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for A = ");
		int a=sc.nextInt();
		
		
		System.out.print("Enter the value for B = ");
		int b=sc.nextInt();
		
		int c=a+b;
		
		
		System.out.println("Addition of A + B = "+c);
		
		
		System.out.println("Enter the number to print table : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " * "+ i + " = " + num*i);
		}
	}
}
