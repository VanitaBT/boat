package com;
import java.util.Scanner;
class Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of lines");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			int x=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x*(i-j)/j;
			}
			System.out.println();
		}
	}

}

