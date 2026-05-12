package pekan6_2511532014;

public class NodeDLL_2511532014 {
	// mendefinisikan kelas node
	int data_2014;
	NodeDLL_2511532014 next_2014; //pointer ke next node
	NodeDLL_2511532014 prev_2014; //pointer ke previous node 
	
	//konstruktor
	public NodeDLL_2511532014(int data_2014) {
		this.data_2014 = data_2014;
		this.next_2014 = null;
		this.prev_2014 = null;
	}
}
