package Pekan3_2511532014;
import java.util.ArrayList;
class Siswa_2511532014 {
	String nama;
	int nim;
	
	public Siswa_2511532014(String nama, int nim) {
		this.nama = nama;
		this.nim = nim;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim + ", Nama: " + nama;
	}
}
public class SiswaStack_2511532014 {
	private ArrayList<Siswa_2511532014> stack;
	public SiswaStack_2511532014() {
		stack = new ArrayList<>();
	}
	public void push_2511532014(Siswa_2511532014 mhs) {
		stack.add(mhs);
	}
	public Siswa_2511532014 pop() {
		if (!isEmpty()) {
			return stack.remove(stack.size()-1);
		}
		return null;
	}
	
	public Siswa_2511532014 peek() {
		if (!isEmpty()) {
			return stack.get(stack.size()-1);
		}
		return null;
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511532014() {
		for (int i = stack.size() - 1; i>=0; i--) {
			System.out.println(stack.get(i));
		}
	}
	
	public static void main(String[] args) {
		SiswaStack_2511532014 studentStack = new SiswaStack_2511532014();
		
		Siswa_2511532014 mhs1= new Siswa_2511532014("Ali", 1); 
		Siswa_2511532014 mhs2= new Siswa_2511532014("Boby", 2);
		Siswa_2511532014 mhs3= new Siswa_2511532014("Charles", 3);
		
		studentStack.push_2511532014(mhs1);
		studentStack.push_2511532014(mhs2);
		studentStack.push_2511532014(mhs3);
		
		System.out.println("Siswa di dalam stack:");
		studentStack.tampilkanSiswa_2511532014();
		
		System.out.println("Siswa teratas "+ studentStack.peek());
		System.out.println("menegeluarkan siswa teratas dari stack: "+ studentStack.pop());
		System.out.println("daftar siswa setelah di pop: ");
		studentStack.tampilkanSiswa_2511532014();
	}

}
