package pekan2_2511532014;

public class DaftarKataDriver_2511532014 {

	public static void main(String[] args) {
		DaftarKata_2511532014 al = new DaftarKata_2511532014();
		
		//menambah element
		al.tambah_2511532014("Kami");
		al.tambah_2511532014("Informatika");
		
		//menyisipkan elemen pada index
		al.tambahPada_2511532014(1, "Mahasiswa");
		
		//cetak isi awal
		System.out.println("Awal	: " + al);
		
		//menambah element index 1
		al.ubahElement_2511532014(1, "Departemen");
		System.out.println("Setelah ubah: "+ al);
		
		//menghapus element pada index 0
		String terhapus = al.hapusElemen_2511532014(0);
		System.out.println("Terhapus	: " + terhapus);
		System.out.println("setelah Hapus: "+ al);
		
		//iterasi pada Arraylist (cetak setiap elemen)
		System.out.print("iterasi:");
		al.iterasiCetak_2511532014();
		System.out.println();

	}

}
