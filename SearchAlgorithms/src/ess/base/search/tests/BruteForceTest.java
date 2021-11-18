package ess.base.search.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;
import org.junit.Before;
import org.junit.Test;

import ess.base.search.BinarySearch;
import ess.base.search.BruteForce;


public class BruteForceTest 
{
	private static int MAX_ARRAY_SIZE = 100000;
	private static int MAX_VALUE = MAX_ARRAY_SIZE+1000;
	
	int[] searchSpace =randomIntArray(MAX_ARRAY_SIZE,MAX_VALUE);

	
	 @Before
     public void setUp() 
	 {
		
     }

	
	@Test
	public void testBruteForce() 
	{
		BruteForce bf = new BruteForce();
		int key =searchSpace[10000];
				
		//Arrays.sort(searchSpace);
		int index = bf.Search(searchSpace, key);
		if(index >=0)
			assertEquals(key, searchSpace[index]) ;
		
	}
	
	
	@Test
	public void testBinarySearch() 
	{
		BinarySearch bf = new BinarySearch();
		int key =searchSpace[6666];
				
		Arrays.sort(searchSpace);
		int index = bf.Search(searchSpace, key, 0, searchSpace.length-1);
		if(index >=0)
			assertEquals(key, searchSpace[index]) ;
		
		
		//int arrays_res = Arrays.binarySearch(searchSpace, key);
		//assertEquals(arrays_res, index) ;
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
