package com;

import java.util.Scanner;

class Alphabets {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		

}
}
