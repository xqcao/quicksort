package quickSortDemo;

import java.util.Arrays;

public class quickSortDemo {

	public static void main(String[] args) {
		int[] abc = { 12, 32, 11, -15, 27, 33, 22, 19, 28, 13, 17 };
		int[] aaa = Arrays.copyOf(abc, abc.length);
		doQuickSort(aaa, 0, aaa.length);
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(aaa));
	}

	private static void doQuickSort(int[] arrays, int start, int end) {
		int left = start;
		int right = end;
		int i, j;
		i = left;
		j = right;
		int temp;
		int pivot = arrays[left];
		while (i <= j) {
			while ((i++) < right - 1 && arrays[i] > pivot)
				;
			while ((--j) > left && arrays[j] < pivot)
				;
			if (i >= j) {
				break;
			}
			temp = arrays[i];
			arrays[i] = arrays[j];
			arrays[j] = temp;
		}
		arrays[left] = arrays[j];
		arrays[j] = pivot;
		if (left < j) {
			doQuickSort(arrays, left, j);
		}
		if (i < right) {
			doQuickSort(arrays, i, right);
		}
	}

}
