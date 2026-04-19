package Pekan3_2511532014;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532014 {
	//Menu
	public static void tampilkanMenu_2014() {
		System.out.println("\n=== Browser History NIM:2511532014 ===");
		System.out.println("1. Kunjungi Website");
		System.out.println("2. Tombol Back");
		System.out.println("3. Lihat Halaman Aktif");
		System.out.println("4. Cek Status History");
		System.out.println("5. Keluar");
	}
	
	//push
	public static void kunjungiWebsite_2014(Stack<Website_2511532014> stack, Scanner sc) {
		System.out.print("Masukkan Judul: ");
        String judul = sc.nextLine();
        System.out.print("Masukkan URL: ");
        String url = sc.nextLine();
        Website_2511532014 websitebaru = new Website_2511532014(judul, url);
        stack.push(websitebaru);
        System.out.println("Berhasil mengunjungi halaman!");
	}
	
	//pop
	public static void tombolBack_2014(Stack<Website_2511532014> stack) {
		try {
            Website_2511532014 dihapus = stack.pop();
            System.out.println("Kembali ke halaman sebelumnya.");
            System.out.println("Halaman yang dihapus:");
            System.out.println(dihapus);
        } catch (EmptyStackException e) {
            System.out.println("Error: History kosong! Tidak ada halaman yang bisa di-back.");
        }
	}
	
	//peek
	public static void checkHalamanAktif_2014(Stack<Website_2511532014> stack) {
		if (!stack.isEmpty()) {
            System.out.println("Halaman Saat Ini:");
            System.out.println(stack.peek());
        } else {
            System.out.println("Tidak ada halaman yang sedang aktif (History kosong).");
        }
	}
	
	//cek Status
	public static void cekStatus_2014(Stack<Website_2511532014> stack) {
		System.out.println("Jumlah riwayat: " + stack.size());
        System.out.println("Apakah history kosong? " + (stack.isEmpty() ? "Ya" : "Tidak"));
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Website_2511532014> stack_2014 = new Stack<>();
		int pilihan;
		do {
			tampilkanMenu_2014();
			System.out.print("Pilih menu: ");
			pilihan = scanner.nextInt();
			scanner.nextLine();
			System.out.println("");
			
			switch(pilihan) {
			case 1:
				kunjungiWebsite_2014(stack_2014, scanner);
				break;
			case 2:
				tombolBack_2014(stack_2014);
				break;
			case 3:
				checkHalamanAktif_2014(stack_2014);
				break;
			case 4:
				cekStatus_2014(stack_2014);
				break;
			case 5:
				System.out.println("Terima kasih telah menggunakan simulasi Browser History.");
			default:
				System.out.println("Pilihan tidak valid!");
			}
		} while (pilihan != 5);
		scanner.close();
	}
}
