package pekan2_2511532014;
import java.util.ArrayList;
public class DaftarKata_2511532014 {
	private final ArrayList<String> data;
	//konstruktor
	public DaftarKata_2511532014() {
		this.data = new ArrayList<>(); 
	}
	//Menambahkan element di akhir list
	public void tambah_2511532014(String element) {
		data.add(element);
	}
	//menambahkan element pada indeks tertentu (menyisipkan)
	public void tambahPada_2511532014(int index, String element) {
		data.add(index, element);
	}
	/*
	 * mengubah nilai pada posisi index menjadi nilaiBaru
	 * Bertindak sebagai "setter" untuk element tertentu
	 */
	public void ubahElement_2511532014(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	//Menghapus element pada posisi index dan mengembalikan nilai yang dihapus
	public String hapusElemen_2511532014(int index) {
		return data.remove(index);
	}
	/*
	 * Melakukan iterasi dan mencetak setiap element dalama format: (index) nilai
	 * (metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi)
	 */
	public void iterasiCetak_2511532014() {
		for (int i=0; i <data.size(); i++) {
			System.out.println(data.get(i)+" ");
		}
	}
	// mengambil element berdasarkan index
	public String get_2511532014(int index) {
		return data.get(index);
	}
	
	//representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}

}
