package pekan6_2511532014;

public class insertDLL_2511532014 {
	//menambahkan Node di awal dll
	static NodeDLL_2511532014 insertBegin_2014(NodeDLL_2511532014 head_2014, int data_2014) {
		//buat node baru
		NodeDLL_2511532014 new_node_2014 = new NodeDLL_2511532014(data_2014);
		//jadikan pointer nextnya head
		new_node_2014.next_2014 = head_2014;
		//jadikan pointer prev head ke new
		if (head_2014 != null) {
			head_2014.prev_2014 = new_node_2014;
		}
		return new_node_2014;
	}
	// fungsi menambahkan node di akhir
	public static NodeDLL_2511532014 insertEnd_2014(NodeDLL_2511532014 head_2014, int newData_2014) {
		//buat node baru
		NodeDLL_2511532014 newNode_2014 = new NodeDLL_2511532014(newData_2014);
		//jika dll null jadikan head
		if (head_2014 == null) {
			head_2014 = newNode_2014;
		} else {
			NodeDLL_2511532014 curr_2014 = head_2014;
			while (curr_2014.next_2014 != null) {
				curr_2014 = curr_2014.next_2014;
			}
			curr_2014.next_2014 = newNode_2014;
			newNode_2014.prev_2014 = curr_2014;
		}
		return head_2014;
	}
	//fungsi menambahkan node di posisi tertentu
	public static NodeDLL_2511532014 insertAtPosition_2014(NodeDLL_2511532014 head_2014, int pos_2014, int new_data_2014) {
		//buat node baru
		NodeDLL_2511532014 new_node_2014 = new NodeDLL_2511532014 (new_data_2014);
		if (pos_2014 == 1) {
			new_node_2014.next_2014 = head_2014;
			if (head_2014 != null) {
				head_2014.prev_2014 = new_node_2014;
			}
			head_2014 = new_node_2014;
			return head_2014;
		}
		NodeDLL_2511532014 curr_2014 = head_2014;
		for (int i = 1; i < pos_2014 - 1 && curr_2014 != null; ++i ) {
			curr_2014 = curr_2014.next_2014;
		}
		if (curr_2014 == null) {
			System.out.println("Posisi tidak ada");
			return head_2014;
		}
		new_node_2014.prev_2014 = curr_2014;
		new_node_2014.next_2014 = curr_2014.next_2014;
		curr_2014.next_2014 = new_node_2014;
		if (new_node_2014.next_2014 != null) {
			new_node_2014.next_2014.prev_2014 = new_node_2014;
		}
		return head_2014;
	}
	public static void printList_2014(NodeDLL_2511532014 head_2014) {
		NodeDLL_2511532014 curr_2014 = head_2014;
		while (curr_2014 != null) {
			System.out.print(curr_2014.data_2014 + " <-> ");
			curr_2014 = curr_2014.next_2014;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//membuat dll 2 <-> 3 <-> 5
		NodeDLL_2511532014 head_2014 = new NodeDLL_2511532014(2);
		head_2014.next_2014 = new NodeDLL_2511532014(3);
		head_2014.next_2014.prev_2014 = head_2014;
		head_2014.next_2014.next_2014 = new NodeDLL_2511532014(5);
		head_2014.next_2014.next_2014.prev_2014 = head_2014.next_2014;
		//cetak DLL awal
		System.out.print("DLL Awal: ");
		printList_2014(head_2014);
		// tambah 1 diawal
		head_2014 = insertBegin_2014(head_2014, 1);
		System.out.print("simpul 1 ditambah di awal: ");
		printList_2014(head_2014);
		// tambah 6 di akhir
		System.out.print("simpul 6 ditambah di akhir: ");
		int data_2014 = 6;
		head_2014 = insertEnd_2014(head_2014, data_2014);
		printList_2014(head_2014);
		// mena,bah node 4 diposisi 4
		System.out.print("tambah node 4 diposisi 4: ");
		int data2_2014 = 4;
		int pos_2014 = 4;
		head_2014 = insertAtPosition_2014(head_2014, pos_2014, data2_2014);
		printList_2014(head_2014);
	}

}
