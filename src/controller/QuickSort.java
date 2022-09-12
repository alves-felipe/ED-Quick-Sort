package controller;

public class QuickSort {
	
	public QuickSort() {
		super();
	}
	
	//	cause i'm working with array, i don't need to return my array.
	//	the values will change by the reference; as well as on changeValues.
	
	public void sort(int[] array, int start, int end) {
		if (start >= end) return;
		int fixPivot = split(array, start, end);
		sort(array, start, fixPivot - 1);
		sort(array, fixPivot + 1, end);
	}
	
	private int split(int[] array, int start, int end) {
		int left = start + 1; 
		int right = end;
		int pivot = array[start];
		
		while(left <= right) {
			while(right >= left && array[left] <= pivot) {
				left++;
			}
			while(right >= left && array[right] > pivot) {
				right--;
			}

			if(right > left) {
				changeValues(array, left, right);
				right--;
				left++;
				
			}
		}
		changeValues(array, start, right);
		return right;
	}
	
	private void changeValues(int[] array, int i, int j) {
		int aux = array[i];
		array[i] = array[j];
		array[j] = aux;
	}

}
