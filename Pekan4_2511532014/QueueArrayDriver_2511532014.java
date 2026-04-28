package Pekan4_2511532014;

public class QueueArrayDriver_2511532014 {
	public static void main(String[]args) {
		QueueArray_2511532014 queue = new QueueArray_2511532014(1000);
		queue.enqueue_2511532014(10);
		queue.enqueue_2511532014(20);
		queue.enqueue_2511532014(30);
		queue.enqueue_2511532014(40);
		System.out.println("Item di depan "+ queue.front_2014());
		System.out.println("Item paling belakang " + queue.rear_2014());
		System.out.println("Tampilkan queue");
		queue.display_2014();
		System.out.println();
		System.out.println(queue.dequeue_2014()+ " dihapus dari queue");
		System.out.println("Item di depan "+ queue.front_2014());
		System.out.println("Item paling belakang " + queue.rear_2014());
		System.out.println("Tampilan queue setelah satu data dihapus ");
		queue.display_2014();
	}

}
 