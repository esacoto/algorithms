package ess.base.search;

import java.util.LinkedList;
import java.util.Queue;

public class BruteForce
{

	/**
	 * @param args
	 */
	
	public  int Search(int[] space, int Key) 
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		if(Key < 0 || space.length <= 0 )
			return -1;
		
		
		for(int i = 0; i < space.length ; i++)
		{
			 if(valid(space[i], Key))
			 {
				 output(space[i], Key);
				 return i;
			 }
		}
		return -1;
	}
	
	private boolean valid(int c, int key)
	{
		return (c==key);			
	}
	
	private void output(int c, int key)
	{
		System.out.printf("Brute Force: found: key-> %d c-> %d", key,c);			
	}
		
	public static void main(String[] args) {
		int sp[] = {1,3,4,2,9,7,11};
		int Key = 11;
		BruteForce bf = new BruteForce();
		int idx = bf.Search(sp,11);
		System.out.println("array " + sp.toString());
		System.out.println("Key " + Key);
		System.out.println("Index found at " + idx);

	}

}
