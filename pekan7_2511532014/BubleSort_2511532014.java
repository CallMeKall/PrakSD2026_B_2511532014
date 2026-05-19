package pekan7_2511532014;

public class BubleSort_2511532014 {
	public static void bubbleSort_2511532014(int[] arr_2014) {
		int n_2014 = arr_2014.length;
		for (int i_2014 = 0; i_2014 < n_2014; i_2014++) {
			for (int j_2014 = 0; j_2014 < n_2014 - 1; j_2014++) {
				if (arr_2014[j_2014] > arr_2014[j_2014 + 1]) {
					int temp_2014 = arr_2014[j_2014];
					arr_2014[j_2014] = arr_2014[j_2014+1];
					arr_2014[j_2014 + 1] = temp_2014;
				//	System.out.println("data:" arr_2014[j_2014] + " "+ arr_2014[j_2014+1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr_2014[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2014 = arr_2014.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i_2014 = 0; i_2014 < n_2014; i_2014++) {
			System.out.print(arr_2014[i_2014] + " ");
		}
		System.out.println("");
		bubbleSort_2511532014(arr_2014);
		System.out.printf("array yang terurut:\n");
		for (int i_2014 = 0; i_2014 < n_2014; i_2014++) {
			System.out.print(arr_2014[i_2014] + " ");
		}
		System.out.println("");

	}

}
