package pekan6_2511532014;

public class Lagu_2511532014 {
	private String judul_2014;
	private String penyanyi_2014;
	
	Lagu_2511532014 next_2014;
	Lagu_2511532014 prev_2014;
	
	// konstruktor
	public Lagu_2511532014(String judul_2014, String penyanyi_2014) {
		this.judul_2014 = judul_2014;
		this.penyanyi_2014 = penyanyi_2014;
		this.next_2014 = null;
		this.prev_2014 = null;
	}
	
	// getter
	public String getJudul_2014() {
        return judul_2014;
    }

    public String getPenyanyi_2014() {
        return penyanyi_2014;
    }

    // setter
    public void setJudul_2014(String judul_2014) {
        this.judul_2014 = judul_2014;
    }

    public void setPenyanyi_2014(String penyanyi_2014) {
        this.penyanyi_2014 = penyanyi_2014;
    }
}
