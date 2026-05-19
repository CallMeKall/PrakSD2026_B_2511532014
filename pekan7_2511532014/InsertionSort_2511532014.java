package pekan7_2511532014;

public class InsertionSort_2511532014 {
	public static void insertionSort_2014(int arr_2014[]) {
		int n_2014 = arr_2014.length;
		for (int i_2014 = 1; i_2014 < n_2014; i_2014++) {
			int key_2014 = arr_2014[i_2014];
			int j_2014 = i_2014 - 1;
			while (j_2014 >= 0 && arr_2014[j_2014] > key_2014) {
				arr_2014[j_2014 + 1] = arr_2014[j_2014];
				j_2014--;
			}
			arr_2014[j_2014 + 1] = key_2014;
		}
	}
	public static void main(String[] args) {
		int arr_2014[] = {23, 78, 45, 8, 32, 56, 1 };
		int n_2014 = arr_2014.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_2014 = 0; i_2014 < n_2014; i_2014++) {
			System.out.print(arr_2014[i_2014] + " ");
		}
		System.out.println("");
		insertionSort_2014(arr_2014);
		System.out.printf("array yang terurut:\n");
		for (int i_2014 = 0; i_2014 < n_2014; i_2014++) {
			System.out.print(arr_2014[i_2014] + " ");
		}
		System.out.println("");
	}

}
