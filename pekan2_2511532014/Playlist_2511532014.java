package pekan2_2511532014;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532014 {
	//Menu
	public static void tampilkanMenu_2014() {
		System.out.println("\n=== Playlist Musik NIM:2511532014 ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Cek Kapasitas ");
		System.out.println("5. Keluar");
	}
	
	//Tambah Lagu
	public static void tambahLagu_2014(ArrayList<Musik_2511532014> array, Scanner input) {
		System.out.print("Masukkan Judul: ");
		String judul = input.nextLine();
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi = input.nextLine();
		System.out.print("Masukkan Durasi: ");
		int durasi = input.nextInt();
		array.add(new Musik_2511532014(judul, penyanyi, durasi));
		System.out.println("Lagu berhasil ditambahkan!.");
	}
	
	//Lihat Playlist
	public static void lihatPlaylist_2014(ArrayList<Musik_2511532014> playlist) {
		if (playlist.isEmpty()) {
			System.out.println("Playlist masing kosong!");
		} else {
			System.out.println("\n=== Daftar Lagu di Playlist ===");
			for (Musik_2511532014 musik: playlist){
				System.out.println(musik);
			}
			System.out.println("-------------------------------");
		}
	}
	
	//Hapus Lagu
	public static void hapusLagu_2014(ArrayList<Musik_2511532014> playlist, Scanner input) {
		System.out.print("Masukan Nomor lagu yang ingin dihapus: ");
		int indeks = input.nextInt() - 1;
		if (indeks >= 0 && indeks < playlist.size()) {
			playlist.remove(indeks);
			System.out.println("Lagu berhasil dihapus.");
		}else {
			System.out.println("Nomor lagu tidak valid");
		}
	}
	
	//Cek Kapasitas lagu
	public static void cekKapasitas_2014(ArrayList<Musik_2511532014> playlist) {
		System.out.println("Total lagu dalam playlist: " + playlist.size() + " lagu");
	}
	
	public static void main(String[] args) {
		ArrayList<Musik_2511532014> playlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int pilihan;
		do {
			tampilkanMenu_2014();
			System.out.print("Pilih menu: ");
			pilihan = scanner.nextInt();
			scanner.nextLine();
			System.out.println("");
			
			switch(pilihan) {
			case 1:
				tambahLagu_2014(playlist, scanner);
				break;
			case 2:
				lihatPlaylist_2014(playlist);
				break;
			case 3:
				hapusLagu_2014(playlist, scanner);
				break;
			case 4:
				cekKapasitas_2014(playlist);
				break;
			case 5:
				System.out.println("Terima kasih telah menggunakan program Playlist Musik!");
                break;
            default:
            	System.out.println("Pilihan tidak valid! Silakan coba lagi.");
			}
			
		} while (pilihan != 5);
		scanner.close();
		
	}
}
