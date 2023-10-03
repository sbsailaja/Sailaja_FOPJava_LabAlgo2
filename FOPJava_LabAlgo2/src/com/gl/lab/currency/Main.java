package com.gl.lab.currency;

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		System.out.println("enter the size of currency denominations");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] denominations = new int[n];
		
		System.out.println("enter the currency denominations value");
		
		for(int i=0; i<denominations.length; i++)
		{
			denominations[i] = in.nextInt();
		}
		
		for(int i : denominations)
		{
			System.out.println(i + " ");
		}
		
		MergeSort sortDesc = new MergeSort(); 
		sortDesc.sort(denominations, 0, denominations.length-1);
		System.out.println("enter the amount you want to pay");
		
		int amount = in.nextInt();
		
		Currency currency = new Currency();
		currency.payment(denominations, amount);
		
		in.close();
	}
	
}
