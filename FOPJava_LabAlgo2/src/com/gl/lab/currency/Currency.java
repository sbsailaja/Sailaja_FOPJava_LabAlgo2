package com.gl.lab.currency;

public class Currency {

	public void payment(int[] denominations, int payAmount)
	{
		int count = 0 ;
		int countDenominations[] = new int[denominations.length];
		
		for(int i=0; i<denominations.length; i++)
		{
			if(payAmount >= denominations[i])
			{
				count = payAmount/denominations[i];
				
				payAmount = payAmount - (denominations[i]*count);
				countDenominations[i] = count;
				
				if(payAmount == 0)
					break;
			}
		}
		if(payAmount == 0)
		{
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<denominations.length; i++)
			{
				if(countDenominations[i] !=0)
					System.out.println(denominations[i]+":"+countDenominations[i]);
			}
			
		}
		else
		{
			System.out.println("Exact pay value cannot be paid with highest possible denominations");
		}
		
	}
		
	
}
