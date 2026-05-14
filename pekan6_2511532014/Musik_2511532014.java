package pekan6_2511532014;

import java.util.Scanner;

public class Musik_2511532014 {
	
	Lagu_2511532014 head_2014;
	Lagu_2511532014 tail_2014;
	
	// menu
	public static void tampilkanMenu_2014() {
		System.out.println("\n=== Playlist Musik NIM: 2511532014 ===");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Hapus Lagu Pertama");
        System.out.println("3. Lihat Playlist (Maju)");
        System.out.println("4. Lihat Playlist (Mundur)");
        System.out.println("5. Cari Lagu");
        System.out.println("6. Keluar");
	}
	
	// menambahkan lagu di akhir playlist
	public void tambahLagu_2014(String judul_2014, String penyanyi_2014) {
		Lagu_2511532014 laguBaru_2014 = new Lagu_2511532014(judul_2014, penyanyi_2014);
		
		//jika playlist kosong
		if (head_2014 == null) {
			head_2014 = laguBaru_2014;
			tail_2014 = laguBaru_2014;
		} else {
			tail_2014.next_2014 = laguBaru_2014;
            laguBaru_2014.prev_2014 = tail_2014;
            tail_2014 = laguBaru_2014;
		}
		System.out.println("Lagu berhasil ditambahkan");
	}
	
	// menghapus lagu pertama
	public void hapusLaguAwal_2014() {
		// Jika playlist kosong
        if (head_2014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        System.out.println("Lagu " + head_2014.getJudul_2014() + " berhasil dihapus.");

        // Jika hanya ada 1 lagu
        if (head_2014 == tail_2014) {
            head_2014 = null;
            tail_2014 = null;
        } else {
            head_2014 = head_2014.next_2014;
            head_2014.prev_2014 = null;
        }
	}
	
	// tampil playlist dari awal sampai akhir
	public void tampilMaju_2014() {

        if (head_2014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }

        Lagu_2511532014 lagu_2014 = head_2014;
        System.out.println("\n=== Playlist Maju ===");
        while (lagu_2014 != null) {
            System.out.println("Judul    : " + lagu_2014.getJudul_2014());
            System.out.println("Penyanyi : " + lagu_2014.getPenyanyi_2014());
            System.out.println("-------------------------");

            lagu_2014 = lagu_2014.next_2014;
        }
	}
	
	// tampil playlist dari akhir ke awal
	public void tampilMundur_2014() {
        if (tail_2014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532014 lagu_2014 = tail_2014;
        System.out.println("\n=== Playlist Mundur ===");
        while (lagu_2014 != null) {
            System.out.println("Judul    : " + lagu_2014.getJudul_2014());
            System.out.println("Penyanyi : " + lagu_2014.getPenyanyi_2014());
            System.out.println("-------------------------");
            lagu_2014 = lagu_2014.prev_2014;
        }
    }
	
	// mencari lagu berdasarkan judul
	public void cariLagu_2014(String judulCari_2014) {
        if (head_2014 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532014 lagu_2014 = head_2014;
        boolean ditemukan_2014 = false;
        while (lagu_2014 != null) {
            if (lagu_2014.getJudul_2014().equalsIgnoreCase(judulCari_2014)) {
                System.out.println("\nLagu ditemukan!");
                System.out.println("Judul    : " + lagu_2014.getJudul_2014());
                System.out.println("Penyanyi : " + lagu_2014.getPenyanyi_2014());
                ditemukan_2014 = true;
                break;
            }
            lagu_2014 = lagu_2014.next_2014;
        }
        if (!ditemukan_2014) {
            System.out.println("Lagu tidak ditemukan!");
        }
    }
	
	// main program
	public static void main(String[] args) {
		Scanner input_2014 = new Scanner(System.in);
		Musik_2511532014 playlist_2014 = new Musik_2511532014();
		int pilihan_2014;
		do {
			tampilkanMenu_2014();
			System.out.print("Pilihan: ");
            pilihan_2014 = input_2014.nextInt();
            input_2014.nextLine();
            switch (pilihan_2014) {
                case 1:
                    System.out.print("Judul Lagu : ");
                    String judul_2014 = input_2014.nextLine();
                    System.out.print("Penyanyi   : ");
                    String penyanyi_2014 = input_2014.nextLine();
                    playlist_2014.tambahLagu_2014(judul_2014, penyanyi_2014);
                    break;
                case 2:
                    playlist_2014.hapusLaguAwal_2014();
                    break;
                case 3:
                    playlist_2014.tampilMaju_2014();
                    break;
                case 4:
                    playlist_2014.tampilMundur_2014();
                    break;
                case 5:
                    System.out.print("Masukkan Judul Lagu: ");
                    String cari_2014 = input_2014.nextLine();
                    playlist_2014.cariLagu_2014(cari_2014);
                    break;
                case 6:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2014 != 6);
        input_2014.close();
	}

}
