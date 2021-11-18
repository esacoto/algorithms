package ess.base.sort;

public class CustomSort extends eSort{
	public void Sort(int[] a)
	{
		int tmp =a[0];
		
		for(int i =0 ; i < a.length ; i++)
		{
			
			for(int j =0 ; j < a.length-1 ; j++)
			
				if(a[i] < a[j] ) //swap
				{
					tmp = a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
		}
				
		
	}

}
