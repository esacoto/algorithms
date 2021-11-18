package ess.base.sort;

public class InsertionSort extends eSort {

	public void Sort( int [ ] num)
	{
		 for(int i=1;i<num.length;i++)
		 {
			 int key = num[i];
			 int j=i-1;
			 while(j>=0 && num[j]>key)
			 {
				 num[j+1] = num[j];
				 j--;
			 }
			 num[j+1] = key;
		 }		 
	}
}
