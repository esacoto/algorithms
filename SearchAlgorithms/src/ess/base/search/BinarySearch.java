package ess.base.search;

import java.util.Arrays;

public class BinarySearch {

	private static final int KEY_NOT_FOUND = -1;


	/**
	 * @param args
	 */
	public int Search(int a[], int key, int imin, int imax)
	{
	  
	
	
	 // continue searching while [imin,imax] is not empty
	  while (imax >= imin)
	    {
	      // calculate the midpoint for roughly equal partition
	      int imid = (imin+imax)/2;
	 
	      // determine which subarray to search
	      if (a[imid] < key)
	        // change min index to search upper subarray
	        imin = imid + 1;
	      else if (a[imid] > key)
	        // change max index to search lower subarray
	        imax = imid - 1;
	      else
	        // key found at index imid
	        return imid;
	    }
	  // key not found
	  return KEY_NOT_FOUND;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={1,3,5,6,7};
		BinarySearch bs = new BinarySearch();
		int res= bs.Search(a, 5, 0,a.length-1);
		System.out.printf("Found at %d", res);
	}

}
