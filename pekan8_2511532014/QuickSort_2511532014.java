package pekan8_2511532014;

public class QuickSort_2511532014 {
	
	static void swap_2014(int[] arr_2014, int i_2014, int j_2014) {
		int temp_2014 = arr_2014[i_2014];
		arr_2014[i_2014] = arr_2014[j_2014];
		arr_2014[j_2014] = temp_2014;
	}
	
	//Metode tambah untuk mengatur pivot menggunakan median
	static void medianOfThree_2014(int[] arr_2014, int low_2014, int high_2014) {
		int mid_2014 = low_2014 + (high_2014 - low_2014) / 2;
		
		//urutkan element
		if (arr_2014[low_2014] > arr_2014[mid_2014]) {
			swap_2014(arr_2014, low_2014, mid_2014);
		}
		if (arr_2014[low_2014] > arr_2014[high_2014]) {
			swap_2014(arr_2014, low_2014, high_2014);
		}
		if (arr_2014[mid_2014] > arr_2014[high_2014]) {
			swap_2014(arr_2014, mid_2014, high_2014);
		}
		swap_2014(arr_2014, mid_2014, high_2014);
	}
	
	static int partition_2014(int[] arr_2014, int low_2014, int high_2014) {
		// panggil fungsi medianofthree sebelum menentukan pivot
		medianOfThree_2014(arr_2014, low_2014, high_2014);
		
		int pivot_2014 = arr_2014[high_2014]; //high_2014 = nilai median
		int i_2014 = (low_2014 - 1);
		
		for (int j_2014 = low_2014; j_2014 <= high_2014 - 1; j_2014++) {
			// jika element saat ini lebih kecil dari atau sama dengan pivot
			if (arr_2014[j_2014] < pivot_2014) {
				i_2014++;
				swap_2014(arr_2014, i_2014, j_2014);
			}
		}
		swap_2014(arr_2014, i_2014 + 1, high_2014);
		return (i_2014+1);
	}
	
	static void quickSort_2014(int[] arr_2014, int low_2014, int high_2014) {
		if (low_2014 < high_2014) {
			int pi_2014 = partition_2014(arr_2014, low_2014, high_2014);
			quickSort_2014(arr_2014, low_2014, pi_2014 - 1);
			quickSort_2014(arr_2014, pi_2014 + 1, high_2014);
		}
	}
	
	public static void printArr_2014(int[] arr_2014) {
		for ( int i_2014 = 0; i_2014 < arr_2014.length; i_2014++) {
			System.out.print(arr_2014[i_2014] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr_2014 = {10, 7, 8, 9, 1, 5};
		int N_2014 = arr_2014.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2014(arr_2014);
		
		quickSort_2014(arr_2014, 0, N_2014 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_2014(arr_2014);
	}

}
