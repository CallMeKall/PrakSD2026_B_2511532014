package pekan1_2511532014;

public class Driver_2511532014 {

	public static void main(String[] args) {
		Mobil_2511532014 mobil = new Mobil_2511532014();
		
		//menambahkan mobil
		mobil.tambahMobil("Avanza", 2020, 1300, 150000000L, "Toyota");
		mobil.tambahMobil("Innova", 2019, 2000, 300000000L, "Toyota");
        mobil.tambahMobil("Xenia", 2021, 1500, 170000000L, "Daihatsu");
        
        //hapus mobil
        System.out.println("Menghapus mobil index 1");
        mobil.hapusMobil(1);
        
        //mutator
        System.out.println("Mengubah merk mobil index 0 menjadi honda");
        mobil.setMerk(0, "honda");
        
        // Selektor
        System.out.println("\n=== Selektor ===");
        System.out.println("Nama mobil index 0 : " + mobil.getNama(0));
        System.out.println("Tahun mobil index 0: " + mobil.getTahun(0));
        System.out.println("CC mobil index 0   : " + mobil.getCc(0));
        System.out.println("Harga mobil index 0: " + mobil.getHarga(0));
        System.out.println("Merk mobil index 0 : " + mobil.getMerk(0));
        
        
	}

}
