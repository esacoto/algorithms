package ess.base.sort;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class eSortTest 
{

	private static int MAX_ARRAY_SIZE = 10000;
	private static int MAX_VALUE = MAX_ARRAY_SIZE + 1000;
	
	int[] unsortedLst =randomIntArray(MAX_ARRAY_SIZE,MAX_VALUE);
	int[] sortedLst = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
	
	
	  @Before
      public void setUp() 
	  {
		 Arrays.sort(sortedLst);
      }

	

	@Test
	public void testIBubbleSort()
	{
		eSort sorter = new IBubbleSort();
		int[] tst2 = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
		sorter.Sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		sorter.Sort(tst2);  //test sorting a sorted list
		assertArrayEquals(sortedLst, tst2);
		
		
	}
	  
	  
	@Test
	public void testBubbleSort()
	{
		eSort sorter = new BubbleSort();
		int[] tst2 = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
		sorter.Sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		sorter.Sort(tst2);  //test sorting a sorted list
		assertArrayEquals(sortedLst, tst2);
		
	}
	
	
	@Test
	public void testInsertionSort() 
	{
		
		eSort sorter = new InsertionSort();
		int[] tst2 = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
		sorter.Sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		sorter.Sort(tst2);  //test sorting a sorted list
		assertArrayEquals(sortedLst, tst2);

	}
	
	@Test
	public void testCustomSort() 
	{
		
		eSort sorter = new CustomSort();
		int[] tst2 = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
		sorter.Sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		sorter.Sort(tst2);  //test sorting a sorted list
		assertArrayEquals(sortedLst, tst2);
		
	}
	
	@Test
	public void testDefaultSort()
	{
		int[] tst2 = Arrays.copyOf(unsortedLst,MAX_ARRAY_SIZE);
		Arrays.sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		Arrays.sort(tst2);
		assertArrayEquals(sortedLst, tst2);
		
	}
	
	
	public static int[] randomIntArray(int length, int n)
	{
	  int[] a = new int[length];
	  Random generator = new Random();
	  // for each item in the list
	  for (int i = 0; i < a.length; i++)
	  {
	      // create a new random number and populate the
	      // current location in the list with it
	      a[i] = generator.nextInt(n);
	  }
	  return a;
	}

}
