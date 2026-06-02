package pekan8_2511532014;

public class MergeSort_2511532014 {
	void merge_2014(int arr_2014[], int l_2014, int m_2014, int r_2014) {
		// find sizes of two subarrays to be merged
		int n1_2014 = m_2014 - l_2014 + 1;
		int n2_2014 = r_2014 - m_2014;
		//create temp arrays
		int L_2014[] = new int[n1_2014];
		int R_2014[] = new int[n2_2014];
		// copty data to temp array
		for (int i_2014 = 0; i_2014 < n1_2014; ++i_2014)
			L_2014[i_2014] = arr_2014[l_2014 + i_2014];
		for (int j_2014 = 0; j_2014 < n2_2014; ++j_2014)
			R_2014[j_2014] = arr_2014[m_2014 + 1 + j_2014];
		int i_2014 = 0, j_2014 = 0;
		//intital index of merged subarray array
		int k_2014 = l_2014;
		while (i_2014 < n1_2014 && j_2014 < n2_2014) {
			if (L_2014[i_2014] <= R_2014[j_2014]) {
				arr_2014[k_2014] = L_2014[i_2014];
				i_2014++;
			} else {
				arr_2014[k_2014] = R_2014[j_2014];
				j_2014++;
			}
			k_2014++;
		}
		// Copy remaining elemenet of L[]
		while (i_2014 < n1_2014) {
			arr_2014[k_2014] = L_2014[i_2014];
			i_2014++;
			k_2014++;
		}
		// Copy remaining elemnts of R[]
		while (j_2014 < n2_2014) {
			arr_2014[k_2014] = R_2014[j_2014];
			j_2014++;
			k_2014++;
		}
	}
	
	void sort_2014( int arr_2014[], int l_2014, int r_2014) {
		if (l_2014 < r_2014) {
			int m_2014 = (l_2014 + r_2014) / 2;
			sort_2014(arr_2014, l_2014, m_2014);
			sort_2014(arr_2014, m_2014 + 1, r_2014);
			merge_2014(arr_2014, l_2014, m_2014, r_2014);
		}
	}
	static void printArray_2014(int arrr_2014[]) {
		int n_2014 = arrr_2014.length;
		for (int i_2014 = 0; i_2014 < n_2014; ++i_2014)
			System.out.print(arrr_2014[i_2014] + " ");
		System.out.println();
	}
	

	public static void main(String[] args) {
		int arr_2014[] = {12, 11, 13, 5, 6};
		System.out.print("Sebelum terurut: ");
		printArray_2014(arr_2014);
		MergeSort_2511532014 ob_2014 = new MergeSort_2511532014();
		ob_2014.sort_2014(arr_2014, 0, arr_2014.length - 1);
		System.out.print("\nSesudah terurut: ");
		printArray_2014(arr_2014);
		

	}

}
