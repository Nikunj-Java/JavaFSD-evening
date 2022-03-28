package com.simplilearn.ordserstatistics;
class QuickSelect {

///QuickSelect


/*This is an optimization over method 1 if QuickSort is used as a sorting algorithm in first step. In QuickSort, we pick a pivot element, then move the pivot element to its correct position and partition the surrounding array. The idea is, not to do complete quicksort, but stop at the point where pivot itself is k’th smallest element. Also, not to recur for both left and right sides of pivot, but recur for one of them according to the position of pivot. The worst case time complexity of this method is O(n2), but it works in O(n) on average.*/
	// Standard partition process of QuickSort.
	// It considers the last element as pivot
	// and moves all smaller element to left of
	// it and greater elements to right
	
	///Actual: 12, 3, 5, 7, 4, 19, 26
	//result: 12, 3, 5, 7, 4, 19, 26
	public static int partition(Integer[] arr, int l,
								int r)
	{
		int x = arr[r], i = l;
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				// Swapping arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
		}

		// Swapping arr[i] and arr[r]
		int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
		
		
		///Actual: 12, 3, 5, 7, 4, 19, 26
		//result: 3,4,5,7,12,19,26

		return i;
	}

	// This function returns k'th smallest element
	// in arr[l..r] using QuickSort based method.
	// ASSUMPTION: ALL ELEMENTS IN ARR[] ARE DISTINCT
	public static int kthSmallest(Integer[] arr, int l,
								int r, int k)
	{
		// If k is smaller than number of elements
		///actual array: 12, 3, 5, 7, 4, 19, 26
		// in array
		if (k > 0 && k <= r - l + 1) {
			// Partition the array around last
			// element and get position of pivot
			// element in sorted array
			int pos = partition(arr, l, r);

			// If position is same as k
			
			
			
			if (pos - l == k - 1)
				return arr[pos];

			// If position is more, recur for
			// left subarray
			if (pos - l > k - 1)
				return kthSmallest(arr, l, pos - 1, k);

			// Else recur for right subarray
			return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
		}

		// If k is more than number of elements
		// in array
		return Integer.MAX_VALUE;
	}

	 
	public static void main(String[] args)
	{
		//Integer arr[] = new Integer[] { 12, 3, 5, 7, 4, 19, 26 };
		Integer arr[] = new Integer[] { 28,16,46,38,55,89,83,30};
		int k = 4;
		System.out.print("K'th smallest element is " + kthSmallest(arr, 0, arr.length - 1, k));
	}
}