package view;

import controller.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		int[] array = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		QuickSort qs = new QuickSort();
		
		qs.sort(array, 0, array.length - 1);
		
		for(int item : array)
			System.out.print(item+" ");
	}

}
