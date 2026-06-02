package pekan8_2511532014;

public class ShellSort_2511532014 {
	public static void shellSort_2014(int[] A_2014) {
		int n_2014 = A_2014.length;
		int gap_2014 = n_2014 / 2;
		while (gap_2014 > 0 ) {
			for (int i_2014 = gap_2014; i_2014 < n_2014; i_2014++) {
				int temp_2014 = A_2014[i_2014];
				int j_2014 = i_2014;
				while (j_2014 >= gap_2014 && A_2014[j_2014 - gap_2014] > temp_2014) {
					A_2014[j_2014] = A_2014[j_2014 - gap_2014];
					j_2014 = j_2014 - gap_2014;
				}
				A_2014[j_2014] = temp_2014;
			}
			gap_2014 = gap_2014/2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_2014 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_2014(data_2014);
		
		shellSort_2014(data_2014);
		
		
		System.out.print("Sesudah: ");
		printArray_2014(data_2014);
	}
	
	public static void printArray_2014(int[] arr_2014) {
		for (int i_2014 : arr_2014) System.out.print(i_2014 + " ");
		System.out.println();
	}
}
