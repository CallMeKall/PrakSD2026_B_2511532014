package pekan6_2511532014;

public class HapusDLL_2511532014 {
	//fungsi menghapus node awal
	public static NodeDLL_2511532014 delHead_2014(NodeDLL_2511532014 head_2014) {
		if (head_2014 == null) {
			return null;
		}
		head_2014 = head_2014.next_2014;
		if (head_2014 != null) {
			head_2014.prev_2014 = null;
		}
		return head_2014;
	}
	//fungsi menghapus diakhir
	public static NodeDLL_2511532014 delLast_2014(NodeDLL_2511532014 head_2014) {
		if (head_2014 == null) {
			return null;
		}
		if (head_2014.next_2014 == null) {
			return null;
		}
		NodeDLL_2511532014 curr_2014 = head_2014;
		while (curr_2014.next_2014 != null) {
			curr_2014 = curr_2014.next_2014;
		}
		//update pointer previous node
		if (curr_2014.prev_2014 != null) {
			curr_2014.prev_2014.next_2014 = null;
		}
		return head_2014;
	}
	//fungsi menghapus node pada posisi tertentu
	public static NodeDLL_2511532014 delPos_2014(NodeDLL_2511532014 head_2014, int pos_2014) {
		//jika dll kosong
		if (head_2014 == null) {
			return head_2014;
		}
		NodeDLL_2511532014 curr_2014 = head_2014;
		// telusuri sampai ke noe yang akan dihapus
		for (int i = 1; curr_2014 != null && i < pos_2014; ++i) {
			curr_2014 = curr_2014.next_2014;
		}
		//jika posisi tidak ditemukan
		if (curr_2014 == null) {
			return head_2014;
		}
		//update pointer
		if (curr_2014.prev_2014 != null) {
			curr_2014.prev_2014.next_2014 = curr_2014.next_2014;
		}
		if (curr_2014.next_2014 != null) {
			curr_2014.next_2014.prev_2014 = curr_2014.prev_2014;
		}
		//jika yang dihapus head
		if (head_2014 == curr_2014) {
			head_2014 = curr_2014.next_2014;
		}
		return head_2014;
	}
	//fungsi mencetak DLL
	public static void printList_2014(NodeDLL_2511532014 head_2014) {
		NodeDLL_2511532014 curr_2014 = head_2014;
		while (curr_2014 != null) {
			System.out.print(curr_2014.data_2014 +  " ");
			curr_2014 = curr_2014.next_2014;
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		//buat sebuah dll
		NodeDLL_2511532014 head_2014 = new NodeDLL_2511532014(1);
		head_2014.next_2014 = new NodeDLL_2511532014(2);
		head_2014.next_2014.prev_2014 = head_2014;
		head_2014.next_2014.next_2014 = new NodeDLL_2511532014(3);
		head_2014.next_2014.next_2014.prev_2014 = head_2014.next_2014;
		head_2014.next_2014.next_2014.next_2014 = new NodeDLL_2511532014(4);
		head_2014.next_2014.next_2014.next_2014.prev_2014 = head_2014.next_2014.next_2014;
		head_2014.next_2014.next_2014.next_2014.next_2014 = new NodeDLL_2511532014(5);
		head_2014.next_2014.next_2014.next_2014.next_2014.prev_2014 = head_2014.next_2014.next_2014.next_2014;
		
		System.out.print("DLL awal: ");
		printList_2014(head_2014);
		
		System.out.print("Setelah head dihapus: ");
		head_2014 = delHead_2014(head_2014);
		printList_2014(head_2014);
		
		System.out.print("Setelah node terakhir dihapus: ");
		head_2014 = delLast_2014(head_2014);
		printList_2014(head_2014);
		
		System.out.print("Menghapus node ke 2: ");
		head_2014 = delPos_2014(head_2014, 2);
		printList_2014(head_2014);

	}

}
