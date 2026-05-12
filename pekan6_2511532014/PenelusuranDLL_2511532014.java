package pekan6_2511532014;

public class PenelusuranDLL_2511532014 {
	//fungsi penelusuran maju
	static void forwardTraversal_2014(NodeDLL_2511532014 head_2014) {
		//memulai penelusuran dari head
		NodeDLL_2511532014 curr_2014 = head_2014;
		//lanjutkan sampai akhir
		while (curr_2014 != null) {
			//print data
			System.out.print(curr_2014.data_2014 + " <-> ");
			//pindahkan ke node berikutnya
			curr_2014 = curr_2014.next_2014;
		}
		//print spasi
		System.out.println();
	}
	
	//fungsi penelusuran mundur
	static void backwardTraversal_2014(NodeDLL_2511532014 tail_2014) {
		//mulai dari akhir
		NodeDLL_2511532014 curr_2014 = tail_2014;
		//lanjut sampai head
		while (curr_2014 != null) {
			//cetak data
			System.out.print(curr_2014.data_2014 + " <-> ");
			// pindahkan ke node sebelumnya
			curr_2014 = curr_2014.prev_2014;
		}
		//cetak spasi
		System.out.println();
	}

	public static void main(String[] args) {
		//cetak DLL
		NodeDLL_2511532014 head_2014 = new NodeDLL_2511532014(1);
		NodeDLL_2511532014 second_2014 = new NodeDLL_2511532014(2);
		NodeDLL_2511532014 third_2014 = new NodeDLL_2511532014(3);
		head_2014.next_2014 = second_2014;
		second_2014.prev_2014 = head_2014;
		second_2014.next_2014 = third_2014;
		third_2014.prev_2014 = second_2014;
		
		System.out.println("Penelusuran maju: ");
		forwardTraversal_2014(head_2014);
		
		System.out.println("Penelusuran mundur: ");
		backwardTraversal_2014(third_2014);

	}

}
