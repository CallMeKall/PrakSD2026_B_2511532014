package pekan5_2511532014;

public class HapusSLL_2511532014 {
	public static NodeSLL_2511532014 deleteHead_2511532014(NodeSLL_2511532014 head_2014) {
		//jika SLL kosong
		if (head_2014 == null) {
			return null;
		}
		//pindahkan head ke node berikutnya
		head_2014 = head_2014.next_2014;
		return head_2014;
	}
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2511532014 removeLastNode_2511532014(NodeSLL_2511532014 head_2014) {
		//jika list kosong return null
		if (head_2014 == null) {
			return null;
		}
		//jika list satu node, hapus node return null
		if (head_2014.next_2014 == null) {
			return null;
		}
		//temukan ndoe terakhir kedua
		NodeSLL_2511532014 secondLast_2014 = head_2014;
		while (secondLast_2014.next_2014.next_2014 != null) {
			secondLast_2014 = secondLast_2014.next_2014;
		}
		//hapus node terakhir
		secondLast_2014.next_2014 = null;
		return head_2014;
	}
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511532014 deleteNode_2511532014(NodeSLL_2511532014 head_2014, int position_2014) {
		NodeSLL_2511532014 temp_2014 = head_2014;
		NodeSLL_2511532014 prev_2014 = null;
		//jika linked list null
		if (temp_2014 == null) {
			return head_2014;
		}
		//kasus 1: head dihapus
		if (position_2014 == 1) {
			head_2014 = temp_2014.next_2014;
			return head_2014;
		}
		//kasus 2: menghapus ndoe ditengah
		//telusuri ke node yg dihapus
		for (int i = 1; temp_2014 != null && i < position_2014; i++) {
			prev_2014 = temp_2014;
			temp_2014 = temp_2014.next_2014;
		}
		//jika ditemukan, hapus node
		if (temp_2014 !=null) {
			prev_2014.next_2014 = temp_2014.next_2014;
		} else {
			System.out.println("data tidak ada");
		}
		return head_2014;
	}
	// fungsi mencetak sll
	public static void printList_2511532014(NodeSLL_2511532014 head_2014) {
		NodeSLL_2511532014 curr_2014 = head_2014;
		while (curr_2014.next_2014 !=null) {
			System.out.print(curr_2014.data_2014 + "-->");
			curr_2014 = curr_2014.next_2014;
		}
		if (curr_2014.next_2014 == null) {
			System.out.print(curr_2014.data_2014);
		}
		System.out.println();
	}
	//kelas main
	public static void main(String[] args) {
		//buat sll 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2511532014 head_2014 = new NodeSLL_2511532014(1);
		head_2014.next_2014 = new NodeSLL_2511532014(2);
		head_2014.next_2014.next_2014 = new NodeSLL_2511532014(3);
		head_2014.next_2014.next_2014.next_2014 = new NodeSLL_2511532014(4);
		head_2014.next_2014.next_2014.next_2014.next_2014 = new NodeSLL_2511532014(5);
		head_2014.next_2014.next_2014.next_2014.next_2014.next_2014 = new NodeSLL_2511532014(6);
		//cetak list awal
		System.out.println("list awal: ");
		printList_2511532014(head_2014);
		//hapus head
		head_2014 = deleteHead_2511532014(head_2014);
		System.out.println("List setelah head dihapus: ");
		printList_2511532014(head_2014);
		//hapus node terakhir
		head_2014 = removeLastNode_2511532014(head_2014);
		System.out.println("list setelah simpul terakhir di hapus: ");
		printList_2511532014(head_2014);
		//deleting node at position 2
		int position_2014 = 2;
		head_2014 = deleteNode_2511532014(head_2014, position_2014);
		//printlist after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2511532014(head_2014);
	}

}
