import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class JavaPlayground {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//int arr[] = { 3,8,2,5,1,4,7,6 };
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
		SortInterface a = new Quicksort();
		a.sortArray(arr);
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

}
