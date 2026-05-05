package pekan5_2511532014;

public class PencarianSLL_2511532014 {
	static boolean searchKey_2511532014(NodeSLL_2511532014 head_2014, int key_2014) {
		NodeSLL_2511532014 curr_2014 = head_2014;
		while (curr_2014 != null) {
			if (curr_2014.data_2014 == key_2014){
				return true;
			}
			curr_2014 = curr_2014.next_2014;
		}
		return false;
	}
	public static void traversal_2511532014(NodeSLL_2511532014 head_2014) {
		//mulai dari head
		NodeSLL_2511532014 curr_2014 = head_2014;
		//telusuri sampai pointer null
		while (curr_2014 != null) {
			System.out.print(" " + curr_2014.data_2014);
			curr_2014 = curr_2014.next_2014;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		NodeSLL_2511532014 head_2014 = new NodeSLL_2511532014(14);
		head_2014.next_2014 = new NodeSLL_2511532014(21);
		head_2014.next_2014.next_2014 = new NodeSLL_2511532014(13);
		head_2014.next_2014.next_2014 = new NodeSLL_2511532014(30);
		head_2014.next_2014.next_2014.next_2014 = new NodeSLL_2511532014(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2511532014(head_2014);
		//data yang akan dicari
		int key_2014 = 30;
		System.out.print("cari data " + key_2014 + " = ");
		if (searchKey_2511532014(head_2014, key_2014)){
			System.out.println("Ketemu");
		} else {
			System.out.println("Tidak ada");
		}
	}
}
