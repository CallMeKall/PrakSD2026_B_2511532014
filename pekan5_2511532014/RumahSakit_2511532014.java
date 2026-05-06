package pekan5_2511532014;

import java.util.Scanner;

public class RumahSakit_2511532014 {
	static Pasien_2511532014 head_2014 = null;
	static int counter_2014 = 0;
	//menu
	public static void tampilkanMenu_2014() {
		System.out.println("\n=== Antrian Rumah Sakit NIM:2511532014 ===");
		System.out.println("1. Daftarkan Pasien (Insert)");
		System.out.println("2. Tombol Panggil Pasien (Delete Head)");
		System.out.println("3. Tampilkan Antrian (Display)");
		System.out.println("4. Cari Pasien (Search)");
		System.out.println("5. Cek Status Antrian");
		System.out.println("6. Keluar");
	}
	
	//mendaftarkan pasien / insert tail
	public static void daftarPasien_2014(String nama_2014, String penyakit_2014) {
		counter_2014++;
		Pasien_2511532014 pasienBaru_2014 = new Pasien_2511532014(nama_2014, penyakit_2014, counter_2014);
		
		if (head_2014 == null) {
			head_2014 = pasienBaru_2014;
		} else {
			Pasien_2511532014 temp_2014 = head_2014;
			while (temp_2014.getNext_2014() != null) {
				temp_2014 = temp_2014.getNext_2014();
			}
			temp_2014.setNext_2014(pasienBaru_2014);
		}
		System.out.println("Pasien berhasil ditambahkan! Nomor Antrian: " + counter_2014);
	}
	
	//panggil pasien / delete head
	public static void panggilPasien_2014() {
		if (head_2014 == null) {
			System.out.println("Antrian kosong!");
		} else {
			System.out.println("Memanggil pasien:");
			System.out.println("Nama	: " + head_2014.getNamaPasien_2014());
			System.out.println("Keluhan	: " + head_2014.getPenyakit_2014());
			System.out.println("Nomor	: " + head_2014.getNomorAntrian_2014());
			head_2014 = head_2014.getNext_2014();
		}
	}
	
	//Tampilkan antrian / Display
	public static void tampilkanAntrian_2014() {
		if  (head_2014 == null) {
			System.out.println("Antrian kosong!");
		} else {
			Pasien_2511532014 temp_2014 = head_2014;
			System.out.println("=== Daftar Antrian ===");
			while (temp_2014 != null) {
				System.out.println("Nama    : " + temp_2014.getNamaPasien_2014());
                System.out.println("Keluhan : " + temp_2014.getPenyakit_2014());
                System.out.println("Nomor   : " + temp_2014.getNomorAntrian_2014());
                System.out.println("---------------------");
                temp_2014 = temp_2014.getNext_2014();
			}
		}
	}
	
	//cari Pasien / Search
	public static void cariPasien_2014(String nama_2014) {
		 if (head_2014 == null) {
	            System.out.println("Antrian kosong!");
	            return;
	        }

	        Pasien_2511532014 temp_2014 = head_2014;
	        boolean ditemukan_2014 = false;

	        while (temp_2014 != null) {
	            if (temp_2014.getNamaPasien_2014().equalsIgnoreCase(nama_2014)) {
	                System.out.println("Pasien ditemukan:");
	                System.out.println("Nama    : " + temp_2014.getNamaPasien_2014());
	                System.out.println("Keluhan : " + temp_2014.getPenyakit_2014());
	                System.out.println("Nomor   : " + temp_2014.getNomorAntrian_2014());
	                ditemukan_2014 = true;
	                break;
	            }
	            temp_2014 = temp_2014.getNext_2014();
	        }

	        if (!ditemukan_2014) {
	            System.out.println("Pasien tidak ditemukan!");
	        }
	}
	
	// Cek Status
	public static void cekStatus_2014() {
		if (head_2014 == null) {
		    System.out.println("Antrian kosong!");
        } else {
            int jumlah_2014 = 0;
            Pasien_2511532014 temp_2014 = head_2014;

            while (temp_2014 != null) {
                jumlah_2014++;
                temp_2014 = temp_2014.getNext_2014();
            }

            System.out.println("Jumlah pasien: " + jumlah_2014);
            System.out.println("Pasien terdepan:");
            System.out.println("Nama    : " + head_2014.getNamaPasien_2014());
            System.out.println("Keluhan : " + head_2014.getPenyakit_2014());
            System.out.println("Nomor   : " + head_2014.getNomorAntrian_2014());
        }
	}
	
	// Main Menu
	public static void main(String[] args) {
		Scanner input_2014 = new Scanner(System.in);
		int pilihan_2014;
		
		do {
			tampilkanMenu_2014();
			System.out.print("Pilihan: ");
            pilihan_2014 = input_2014.nextInt();
            input_2014.nextLine();
            
            switch (pilihan_2014) {
            case 1:
            	System.out.print("Masukan Nama Pasien: ");
            	String nama_2014 = input_2014.nextLine();
            	System.out.print("Masukan Keluhan: ");
            	String Keluhan_2014 = input_2014.nextLine();
            	daftarPasien_2014(nama_2014, Keluhan_2014);
            	break;
            case 2:
            	panggilPasien_2014();
            	break;
            case 3:
            	tampilkanAntrian_2014();
            	break;
            case 4:
            	System.out.print("Masukan nama pasien yang dicari: ");
            	String cari_2014 = input_2014.nextLine();
            	cariPasien_2014(cari_2014);
            	break;
            case 5:
            	cekStatus_2014();
            	break;
            case 6:
            	System.out.println("Terima kasih!");
            	break;
            default:
            	System.out.println("Pilihan tidak valid");
            }
			
		} while (pilihan_2014 != 6);
		
		input_2014.close();
	}

}
