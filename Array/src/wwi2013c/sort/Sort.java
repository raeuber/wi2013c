package wwi2013c.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {

	List<Integer> list;

	public Sort() {

	}

	public static int[] bubblesort(int[] zusortieren, int reinfolge) {
		int temp;

		for (int i = 1; i < zusortieren.length; i++) {
			for (int j = 0; j < zusortieren.length - i; j++) {
				if (reinfolge == 1) {
					if (zusortieren[j] > zusortieren[j + 1]) {
						temp = zusortieren[j];
						zusortieren[j] = zusortieren[j + 1];
						zusortieren[j + 1] = temp;
					}

				} else if (reinfolge == 2) {
					if (zusortieren[j] < zusortieren[j + 1]) {
						temp = zusortieren[j];
						zusortieren[j] = zusortieren[j + 1];
						zusortieren[j + 1] = temp;
					}

				}
			}
		}
		return zusortieren;
	}

	public static void main(String[] args) {
		int[] array = { 85, 77, 8, 11, 7, 28, 99, 13, 1, 57, 61, 72, 15, 41,
				156 };

		// 1 = aufwärts 2= abwärts
		int[] sortiert = bubblesort(array, 2);

		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + ", ");
		}
	}
}
