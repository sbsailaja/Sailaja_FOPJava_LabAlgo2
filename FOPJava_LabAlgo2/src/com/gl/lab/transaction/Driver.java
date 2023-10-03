package com.gl.lab.transaction;

import java.util.Scanner;

public class Driver {

	public static void main(String args[])
	{
		System.out.println("enter the size of transaction array");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] transactions = new int[n];
		
		System.out.println("enter the values of array");
		
		for(int i=0; i<n; i++)
		{
			transactions[i] = in.nextInt();		
		}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int NoofTarget = in.nextInt();
		
		
		Transaction trans = new Transaction();
		
		for(int j=0; j<NoofTarget; j++)
		{
			System.out.println("enter the value of target");
			int targetValue = in.nextInt();
			int res = trans.transactionCheck(transactions, targetValue);
			if(res >= 0)
				System.out.println("Target achieved after "+(res+1)+" transactions");
			else
				System.out.println("Given target is not achieved");
		}
		in.close();
	}
	
	
}
