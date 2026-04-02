package pekan1_2511532014;

public final class Mobil_2511532014 {
	private String[] nama;
	private int[] tahun;
	private int[] cc;
	private long[] harga;
	private String[] merk;
	
	private int size; //jumlah mmobil saat ini
	private final int Kapasitas = 10; //kapasitas array
	
	//konstruktor
	public Mobil_2511532014() {
		nama= new String[Kapasitas];
		tahun= new int[Kapasitas];
		cc= new int[Kapasitas];
		harga= new long[Kapasitas];
		merk= new String[Kapasitas];
		size= 0;
	}
	
	//tambah mobil
	public void tambahMobil(String n, int t, int c, long h, String m) {
		if (size< Kapasitas) {
			nama[size]=n;
			tahun[size]=t;
			cc[size]=c;
			harga[size]=h;
			merk[size]=m;
			size++;
			
			System.out.println("Mobil berhasil ditambah");
		} else {
			System.out.println("array penuh");
		}
	}
	
	//hapus mobil
	public void hapusMobil(int index) {
		if(index>=0 && index<size) {
			for (int i = index; i < size-1;i++) {
				nama[i]=nama[i+1];
				tahun[i]=tahun[i+1];
				cc[i]=cc[i+1];
				harga[i]=harga[i+1];
				merk[i]=merk[i+1];
			}
            nama[size - 1] = null;
            tahun[size - 1] = 0;
            cc[size - 1] = 0;
            harga[size - 1] = 0;
            merk[size - 1] = null;
            size--;
            System.out.println("Mobil pada index "+ index +" berhasil dihapus");

		}else {
			System.out.println("index tidak valid");
		}
	}
	
	//selektor (getter)
	public String getNama(int index) {
		if (index>=0 && index<size) return nama[index];
		return null;
	}
	
	public int getTahun(int index) {
		if (index>=0 && index<size) return tahun[index];
		return-1;
	}
	
	public int getCc(int index) {
		if (index>=0 && index<size) return cc[index];
		return-1;
	}
	
	public long getHarga(int index) {
		if (index>=0 && index<size) return cc[index];
		return-1;
	}
	
	public String getMerk(int index) {
		if (index>=0 && index<size) return merk[index];
		return null;
	}
	
	public int getSize() {
		return size;
	}
	
	//mutator (setter)
    public void setNama(int index, String newNama) {
        if (index >= 0 && index < size) {
            nama[index] = newNama;
            System.out.println("Nama mobil berhasil diubah!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    public void setTahun(int index, int newTahun) {
        if (index >= 0 && index < size) {
            tahun[index] = newTahun;
            System.out.println("Tahun mobil berhasil diubah!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    
    public void setCc(int index, int newCc) {
        if (index >= 0 && index < size) {
            cc[index] = newCc;
            System.out.println("CC mobil berhasil diubah!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    
    public void setHarga(int index, long newHarga) {
        if (index >= 0 && index < size) {
            harga[index] = newHarga;
            System.out.println("Harga mobil berhasil diubah!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    
    public void setMerk(int index, String newMerk) {
        if (index >= 0 && index < size) {
            merk[index] = newMerk;
            System.out.println("Merk mobil berhasil diubah!");
        } else {
            System.out.println("Index tidak valid!");
        }
    }
    
    


}
