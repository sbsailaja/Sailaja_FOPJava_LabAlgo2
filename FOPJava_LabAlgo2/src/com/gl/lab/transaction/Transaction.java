package com.gl.lab.transaction;

import java.util.Scanner;

public class Transaction {

	public int transactionCheck(int[] transaction, int targetValue)
	{
		int sum = 0;
			
		for(int i=0; i<transaction.length; i++)
		{
			sum += transaction[i];
			if(sum >= targetValue)
				return i;
		}
		if(sum< targetValue)
			return -1;
		return sum;
		
	}
	
}
