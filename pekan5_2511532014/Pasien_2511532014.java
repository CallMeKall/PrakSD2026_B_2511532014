package pekan5_2511532014;

public class Pasien_2511532014 {
	String namaPasien_2014;
	String penyakit_2014;
	int nomorAntrian_2014;
	Pasien_2511532014 next_2014;
	
	// Construktor
	public Pasien_2511532014(String namaPasien_2014, String penyakit_2014, int nomorAntrian_2014){
		this.namaPasien_2014 = namaPasien_2014;
		this.penyakit_2014 = penyakit_2014;
		this.nomorAntrian_2014 = nomorAntrian_2014;
		this.next_2014 = null;
	}
	
	//getter
	public String getNamaPasien_2014() {
		return namaPasien_2014;
	}
	public String getPenyakit_2014() {
		return penyakit_2014;
	}
	public int getNomorAntrian_2014() {
		return nomorAntrian_2014;
	}
	public Pasien_2511532014 getNext_2014() {
		return next_2014;
	}
	
	//setter
	public void setNamaPasien(String namaPasien_2014) {
		this.namaPasien_2014 = namaPasien_2014;
	}
	public void setPenyakit_2014(String penyakit_2014) {
		this.penyakit_2014 = penyakit_2014;
	}
	public void setNomorAntrian_2014(int nomorAntrian_2014) {
		this.nomorAntrian_2014 = nomorAntrian_2014;
	}
	public void setNext_2014(Pasien_2511532014 next_2014) {
		this.next_2014 = next_2014;
	}

}
