import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;


public class JavaPlayground {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int arr[] = new int[100000];

		File file = new File("/Users/naamanalhashimi/Downloads/IntegerArray2.txt");

		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		int i = 0;
		while ((st = br.readLine()) != null) {
			arr[i] = Integer.parseInt(st);
			i++;
		}

		br.close();
		SortInterface a = new MergeSort();
		int[] rtn = a.sortArray(arr);

	}

}
