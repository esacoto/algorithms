package ess.base.sort;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] dataSet = {5,7,1,9};
		eSort sorter[] =new eSort[4];
		
		
		sorter[0] = new IBubbleSort();
		sorter[1] = new BubbleSort();
		sorter[2] = new InsertionSort();
		sorter[3] = new CustomSort();
		
		for(eSort s : sorter)
		{
			s.Sort(dataSet);
			printArray(dataSet);
		}
		
		
		

	}
	
	private static void printArray(int[] a)
	{
		for(int i =0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}

	}
}
