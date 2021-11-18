package ess.base.sort;

public class BubbleSort extends eSort{

	public  void Sort(int[] a) {

		int n = a.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (a[j - 1] > a[j]) {
					// swap the elements!
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}

			}
		}

	}
	

}
