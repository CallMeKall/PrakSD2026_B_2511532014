package Pekan3_2511532014;

public class Website_2511532014 {
	private String judul_2014;
	private String url_2014;
	
	//konstruktor
	public Website_2511532014(String judul_2014, String url_2014){
		this.judul_2014 = judul_2014;
		this.url_2014 = url_2014;
	}
	
	//Getter
	public String getJudul_2014() {
		return judul_2014;
	}
	public String getUrl_2014() {
		return url_2014;
	}
	
	//Setter
	public void setJudul_2014(String judul_2014) {
		this.judul_2014 = judul_2014;
	}
	public void setUrl_2014(String url_2014) {
		this.url_2014 = url_2014;
	}
	
	@Override 
	public String toString() {
		return "Judul: " + judul_2014 + ", URL: " +url_2014;
	}

}
