
public class Quicksort implements SortInterface {
	
	public long inversion = 0;
	
	
	public int[] sortArray(int[] arrayToSort) 
	{
		int[] rtn = this.quickSort(arrayToSort, 0, arrayToSort.length);
		
		return rtn;
	}

	public int[] quickSort(int[] arrayToSort, int left, int right) 
	{
		if( (right - left) <= 1 ) {
			return arrayToSort;
		}

		int p = arrayToSort[left];
		int i = left + 1;
		int j = left + 1;
		while ( j < right ) {
			if (arrayToSort[j] < p ) {
				if( i != j ) {
					int swap = arrayToSort[j];
					arrayToSort[j] = arrayToSort[i];
					arrayToSort[i] = swap;
				}
				i++;
			}
			j++;
		}
		int swap = arrayToSort[i -1];
		arrayToSort[i-1] = arrayToSort[left];
		arrayToSort[left] = swap;
		arrayToSort = quickSort(arrayToSort, left, i);
		arrayToSort = quickSort(arrayToSort, i, right);
		return arrayToSort;
	}
	
	


}