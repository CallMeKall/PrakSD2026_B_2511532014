package pekan5_2511532014;

public class TambahSLL_2511532014 {
	public static NodeSLL_2511532014 insertAtFront_2511532014 (NodeSLL_2511532014 head_2014, int value_2014) {
		NodeSLL_2511532014 new_node_2014 = new NodeSLL_2511532014(value_2014);
		new_node_2014.next_2014 = head_2014;
			return new_node_2014;
	}
	//fungsi menambahkan node diakhir SLL
	public static NodeSLL_2511532014 insertAtEnd_2511532014 (NodeSLL_2511532014 head_2014, int value_2014) {
		//buat sebuah node dengan sebuah nilai
		NodeSLL_2511532014 newNode_2014 = new NodeSLL_2511532014(value_2014);
		//jika list kosong maka node akan jadi head
		if (head_2014 == null) {
			return newNode_2014;
		}
		//simpan head ke variabel sementara
		NodeSLL_2511532014 last_2014 = head_2014;
		//telusuri ke node akhir
		while (last_2014.next_2014 != null) {
			last_2014 = last_2014.next_2014;
		}
		//ubah pointer
		last_2014.next_2014 = newNode_2014;
		return head_2014;
	}
	static NodeSLL_2511532014 GetNode_2511532014 (int data_2014) {
		return new NodeSLL_2511532014(data_2014);
	}
	
	static NodeSLL_2511532014 insertPos_2511532014(NodeSLL_2511532014 headNode_2014, int position_2014, int value_2014) {
		NodeSLL_2511532014 head_2014 = headNode_2014;
		if (position_2014 < 1) {
			System.out.print("Invalid position");
		}
		if (position_2014 == 1) {
			NodeSLL_2511532014 new_node_2014 = new NodeSLL_2511532014(value_2014);
			new_node_2014.next_2014 = head_2014;
			return new_node_2014;
		} else {
			while (position_2014-- != 0) {
				if (position_2014 == 1) {
					NodeSLL_2511532014 newNode_2014 = GetNode_2511532014(value_2014);
					newNode_2014.next_2014 = headNode_2014.next_2014;
					headNode_2014.next_2014 = newNode_2014;
					break;
				}
				headNode_2014 = headNode_2014.next_2014;
			}
			if (position_2014 != 1) 
				System.out.print("Posisi diluar jangkauan");
		}
		return head_2014;
	}
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
	
	public static void main(String[]args) {
		//buat linked list 2-->3-->5-->6
		NodeSLL_2511532014 head_2014 = new NodeSLL_2511532014(2);
		head_2014.next_2014 = new NodeSLL_2511532014(3);
		head_2014.next_2014.next_2014 = new NodeSLL_2511532014(5);
		head_2014.next_2014.next_2014.next_2014 = new NodeSLL_2511532014(6);
		//cetak list asli
		System.out.print("Senarai berantai awal: ");
		printList_2511532014(head_2014);
		//tambahkan node baru di depan
		System.out.print("tambah 1 simpul di depan: ");
		int data_2014 = 1;
		head_2014 = insertAtFront_2511532014(head_2014, data_2014);
		//cetak update list
		printList_2511532014(head_2014);
		//tambahkan ndoe baru dibelakang
		System.out.print("tambah 1 simpul di belakang: ");
		int data2_2014 = 7;
		head_2014 = insertAtEnd_2511532014(head_2014, data2_2014);
		//cetak update list
		printList_2511532014(head_2014);
		System.out.print("tambah 1 simpul ke data 4: ");
		int data3_2014 = 4;
		int pos_2014 = 4;
		head_2014 = insertPos_2511532014(head_2014, pos_2014, data3_2014);
		//cetak update list
		printList_2511532014(head_2014);
	}

}
