package pekan9_2511532014;

public class BtreeDriver_2511532014 {
	public static void main(String[] args) {
		// Membuat Pohon
		BTree_2511532014 tree_2014 = new BTree_2511532014();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_2014.countNodes_2014());
		// Menambahkan simpul data 1
		Node_2511532014 root_2014 = new Node_2511532014(1);
		// Menjadikan simpul 1 sebagai root
		tree_2014.setRoot_2014(root_2014);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_2014.countNodes_2014());

		Node_2511532014 node2_2014 = new Node_2511532014(2);
		Node_2511532014 node3_2014 = new Node_2511532014(3);
		Node_2511532014 node4_2014 = new Node_2511532014(4);
		Node_2511532014 node5_2014 = new Node_2511532014(5);
		Node_2511532014 node6_2014 = new Node_2511532014(6);
		Node_2511532014 node7_2014 = new Node_2511532014(7);
		Node_2511532014 node8_2014 = new Node_2511532014(8);
		Node_2511532014 node9_2014 = new Node_2511532014(9);

		root_2014.setLeft_2014(node2_2014);
		node2_2014.setLeft_2014(node4_2014);
		node2_2014.setRight_2014(node5_2014);
		node4_2014.setRight_2014(node8_2014);
		root_2014.setRight_2014(node3_2014);
		node3_2014.setLeft_2014(node6_2014);
		node3_2014.setRight_2014(node7_2014);
		node6_2014.setLeft_2014(node9_2014);
		
		//set root
		tree_2014.setCurrent_2014(tree_2014.getRoot_2014());
		System.out.println("Menampilkan simpul terakhir");
		System.out.println(tree_2014.getCurrent_2014().getData_2014());
		System.out.println("Jumlah simpul setelah simpul 7 ditambahakan");
		System.out.println(tree_2014.countNodes_2014());
		System.out.println("InOrder:");
		tree_2014.printInorder_2014();
		System.out.println("\nPreorder:");
		tree_2014.printPreOrder_2014();
		System.out.println("\nPostorder:");
		tree_2014.printPostOrder_2014();
		System.out.println("\nMenemapilkan simpul dalam bentuk pohon");
		tree_2014.print_2014();
	}
}