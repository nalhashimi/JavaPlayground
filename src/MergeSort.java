
public class MergeSort implements SortInterface {
	
	public long inversion = 0;
	
	
	public int[] sortArray(int[] arrayToSort) {
		int[] rtn = this.mergeSort(arrayToSort);
		System.out.println("Inversion: " + this.inversion);
		return rtn;
	}

	public int[] mergeSort(int[] arrayToSort) {

		if(arrayToSort.length <= 1) {
			return arrayToSort;
		}
		boolean isOdd = false;
		if (arrayToSort.length%2 == 1) {
			isOdd = true;
		}
		int split = arrayToSort.length/2;
		int[] left = new int[split];
		int [] right;
		if(isOdd) {
			right = new int[split + 1];
		} else {
			right = new int[split];
		}

		System.arraycopy(arrayToSort, 0, left, 0, left.length);
		System.arraycopy(arrayToSort, split, right, 0, right.length);

		left = this.mergeSort(left);
		right = this.mergeSort(right);
		return this.merge(left, right);

	}

	public int[] merge(int [] left, int [] right) {
		int[] rtnArr = new int[left.length + right.length];
		long inversionCount = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				rtnArr[k] = left[i];
				i++;
			} else {
				rtnArr[k] = right[j];
				inversionCount = inversionCount + (left.length - i);
				j++;
			}
			k++;
		}

		while(i < left.length) {
			rtnArr[k] = left[i];
			i++;
			k++;
		}

		while(j < right.length) {
			rtnArr[k] = right[j];
			j++;
			k++;
		}
		this.inversion += inversionCount;

		return rtnArr;
	}


}