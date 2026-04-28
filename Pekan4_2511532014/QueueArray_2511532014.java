package Pekan4_2511532014;

public class QueueArray_2511532014 {
	int front_2014, rear_2014, size_2014;
	int capacity_2014;
	int array_2014[];
	
	public QueueArray_2511532014(int capacity_2014) {
		this.capacity_2014 = capacity_2014;
		front_2014 = this.size_2014 = 0;
		rear_2014 = capacity_2014 - 1;
		array_2014 = new int[this.capacity_2014];
	}
	
	boolean isFull_2511532014(QueueArray_2511532014 queue_2014) {
		return (queue_2014.size_2014 == queue_2014.capacity_2014);
	}
	
	boolean isEmpty_2511532014(QueueArray_2511532014 queue_2014) {
		return (queue_2014.size_2014 == 0);
	}
	
	void enqueue_2511532014 (int item_2014) {
		if (isFull_2511532014(this))
			return;
		this.rear_2014 = (this.rear_2014 + 1) % this.capacity_2014;
		this.array_2014[this.rear_2014] = item_2014;
		this.size_2014 = this.size_2014 + 1;
		System.out.println(item_2014 + " enqueue to queue");
	}
	
	int dequeue_2014() {
		if (isEmpty_2511532014 (this))
			return Integer.MIN_VALUE;
		int item_2014 = this.array_2014[this.front_2014];
		this.front_2014 = (this.front_2014 + 1) % this.capacity_2014;
		this.size_2014 = this.size_2014 - 1;
		return item_2014;
	}
	
	int front_2014() {
		if (isEmpty_2511532014(this))
			return Integer.MIN_VALUE;
		
		return this.array_2014[this.front_2014];
	}
	
	int rear_2014() {
		if (isEmpty_2511532014(this))
			return Integer.MIN_VALUE;
		return this.array_2014[this.rear_2014];
	}
	
	void display_2014() {
		int i;
		if (front_2014 == rear_2014) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		//kunjungi dari belakang dan cetak
		for (i = front_2014; i < rear_2014; i++) {
			System.out.printf(" %d <-- ", array_2014[i]);
		}
		return;
	}

}
