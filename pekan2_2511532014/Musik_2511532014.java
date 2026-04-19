package pekan2_2511532014;

public class Musik_2511532014 {
	
	private String judul_2014;
	private String penyanyi_2014;
	private int durasi_2014; // Detik
	
	//konstruktor
	public Musik_2511532014(String judul_2014, String penyanyi_2014, int durasi_2014) {
		this.judul_2014 = judul_2014;
		this.penyanyi_2014 = penyanyi_2014;
		this.durasi_2014 = durasi_2014;
	}
	
	//Selektor
	public String getJudul_2014() {
		return judul_2014;
	}
	
	public String getPenyanyi_2014() {
		return penyanyi_2014;
	}
	
	public int getDurasi_2014() {
		return durasi_2014;
	}
	
	//Setter
	public void setJudul_2008(String judul_2014) {
        this.judul_2014 = judul_2014;
    }

    public void setPenyanyi_2008(String penyanyi_2014) {
        this.penyanyi_2014 = penyanyi_2014;
    }

    public void setDurasi_2008(int durasi_2014) {
        this.durasi_2014 = durasi_2014;
    }
    
    @Override
	public String toString(){
		return "Judul: " + judul_2014 + ", Penyanyi: " + penyanyi_2014 + ", Durasi: " + durasi_2014 + " Detik.";
	}
    

}
