package Pekan4_2511532014;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511532014 {

	public static void main(String[] args) {
		Queue<String> q_2511532014 = new LinkedList<>();
		
		q_2511532014.add("Praktikum");
		q_2511532014.add("Struktur");
		q_2511532014.add("Data");
		q_2511532014.add("Dan");
		q_2511532014.add("Algoritma");
		Iterator<String> iterator_2511532014 = q_2511532014.iterator();
		while (iterator_2511532014.hasNext()) {
			System.out.print(iterator_2511532014.next()+ " ");
		}

	}

}
