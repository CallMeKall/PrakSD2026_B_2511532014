package pekan8_2511532014;

import java.util.Scanner;

public class Sorting_2511532014 {
	//array untuk menyimpan lagu max = 20
	static Lagu_2511532014[] dataLagu_2014 = new Lagu_2511532014[20];
	static int jumlahLagu_2014 = 0;
	
	// input data
	static void inputData_2014(){
		
		dataLagu_2014[0]  = new Lagu_2511532014("Awan Dan Angin", "Isyana Sarasvati", 214);
        dataLagu_2014[1]  = new Lagu_2511532014("Meraih Bintang", "Via Vallen", 243);
        dataLagu_2014[2]  = new Lagu_2511532014("Lagu Untukmu", "Afgan", 198);
        dataLagu_2014[3]  = new Lagu_2511532014("Rasa Yang Tertinggal", "Raisa", 265);
        dataLagu_2014[4]  = new Lagu_2511532014("Bukan Rayuan Gombal", "Judika", 237);
        dataLagu_2014[5]  = new Lagu_2511532014("Hati Yang Kau Sakiti","Rossa", 251);
        dataLagu_2014[6]  = new Lagu_2511532014("Demi Nama Cintamu", "Zara Leola", 223);
        jumlahLagu_2014 = 7;
		
	}
	
	static void mergeSort_2014(Lagu_2511532014[] arr_2014, int kiri_2014, int kanan_2014) {
		if (kiri_2014 < kanan_2014) {
			int tengah_2014 = (kiri_2014 + kanan_2014) / 2;
			
			mergeSort_2014(arr_2014, kiri_2014, tengah_2014);
			mergeSort_2014(arr_2014, tengah_2014 + 1, kanan_2014);
			
			merge_2014(arr_2014, kiri_2014, tengah_2014, kanan_2014);
		}
	}
	
	static void merge_2014(Lagu_2511532014[] arr_2014, int kiri_2014, int tengah_2014, int kanan_2014) {
		int n1_2014 = tengah_2014 - kiri_2014 + 1;
		int n2_2014 = kanan_2014 - tengah_2014;
		
		//array sementara
		Lagu_2511532014[] kiriArr_2014 = new Lagu_2511532014[n1_2014];
		Lagu_2511532014[] kananArr_2014 = new Lagu_2511532014[n2_2014];
		
		for (int i_2014 = 0; i_2014 < n1_2014; i_2014++)
			kiriArr_2014[i_2014] = arr_2014[kiri_2014 + i_2014];
		for (int j_2014 = 0; j_2014 < n2_2014; j_2014++)
			kananArr_2014[j_2014] = arr_2014[tengah_2014 + 1 + j_2014];
		
		int i_2014 = 0, j_2014 = 0, k_2014 = kiri_2014;
		
		while (i_2014 < n1_2014 && j_2014 < n2_2014) {
			if (kiriArr_2014[i_2014].judul_2014.compareToIgnoreCase(kananArr_2014[j_2014].judul_2014) <= 0) {
				arr_2014[k_2014++] = kiriArr_2014[i_2014++];
			} else {
				arr_2014[k_2014++] = kananArr_2014[j_2014++];
			}
		}
		
		while (i_2014 < n1_2014)
			arr_2014[k_2014++] = kiriArr_2014[i_2014++];
		while (j_2014 < n2_2014)
			arr_2014[k_2014++] = kananArr_2014[j_2014++];
	}
	
	static void tampilData_2014(String label_2014) {
	    System.out.println("\n" + label_2014);
	    System.out.println("-".repeat(55));

	    for (int i_2014 = 0; i_2014 < jumlahLagu_2014; i_2014++) {
	        Lagu_2511532014 l_2014 = dataLagu_2014[i_2014];

	        System.out.printf("%2d. %-35s - %d detik%n",
	                i_2014 + 1,
	                l_2014.judul_2014 + " (" + l_2014.penyanyi_2014 + ")",
	                l_2014.durasi_2014);
	    }

	    System.out.println("-".repeat(55));
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("=".repeat(55));
        System.out.println("   SORTING PLAYLIST - NIM: 2511532014");
        System.out.println("   Algoritma: Merge Sort (Judul A-Z)");
        System.out.println("=".repeat(55));
 
        // Isi data awal
        inputData_2014();
 
        // Tampilkan data sebelum sorting
        tampilData_2014("Data Sebelum Merge Sort:");
 
        // Konfirmasi jalankan sorting
        System.out.print("\nJalankan Merge Sort? (y/n): ");
        String pilihan = sc.nextLine().trim().toLowerCase();
 
        if (pilihan.equals("y")) {
            // Jalankan Merge Sort
            mergeSort_2014(dataLagu_2014, 0, jumlahLagu_2014 - 1);
 
            // Tampilkan data sesudah sorting
            tampilData_2014("Data Setelah Merge Sort (Judul A-Z):");
            System.out.println("\nSorting selesai! Data telah diurutkan berdasarkan Judul A-Z.");
        } else {
            System.out.println("Sorting dibatalkan.");
        }
 
        sc.close();
    }
	
}
