package Pekan4_2511532014;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532014 {

	public static void main(String[] args) {
		Queue<Integer> q_2511532014 = new LinkedList<>();
		// tambah element
		for (int i = 0; i < 6; i++)
			q_2511532014.add(i);
		//menampilkan isis antrian
		System.out.println("Element Antrian " + q_2511532014);
		//untuk menghapus kepala antrian
		int hapus_2014 = q_2511532014.remove();
		System.out.println("Hapus Element = "+ hapus_2014);
		System.out.println(q_2511532014);
		//untuk melihat antrian terdepan
		int depan_2014 = q_2511532014.peek();
		System.out.println("Kepala Antrian = " + depan_2014);
		
		int banyak_2014 = q_2511532014.size();
		System.out.println("Size Antrian = "+ banyak_2014);
	}

}
