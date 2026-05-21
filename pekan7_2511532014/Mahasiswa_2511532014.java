package pekan7_2511532014;

public class Mahasiswa_2511532014 {
	private String nama_2014;
	private String nim_2014;
	private String prodi_2014;
	
	// konstruktor
	public Mahasiswa_2511532014(String nama_2014, String nim_2014, String prodi_2014) {
		this.nama_2014 = nama_2014;
		this.nim_2014 = nim_2014;
		this.prodi_2014 = prodi_2014;
	}
	
	//setter
	public void setNama_2014(String nama_2014){
		this.nama_2014 = nama_2014;
	}
	public void setNim_2014(String nim_2014) {
		this.nim_2014 = nim_2014;
	}
	public void setProdi_2014(String prodi_2014) {
		this.prodi_2014 = prodi_2014;
	}
	
	//getter
	public String getNama_2014() {
		return nama_2014;
	}
	public String getNim_2014() {
		return nim_2014;
	}
	public String getProdi_2014() {
		return prodi_2014;
	}
	
	@Override
	public String toString() {
		return nama_2014;
	}
	
}
