package Pekan4_2511532014;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2511532014 {

	public static void main(String[] args) {
		Queue<Integer> q_2511532014 = new LinkedList<Integer>();
		q_2511532014.add(1);
		q_2511532014.add(2);
		q_2511532014.add(3); //[1, 2, 3]
		System.out.println("Sebelum reverse "+ q_2511532014);
		Stack<Integer> s_2511532014 = new Stack<Integer>();
		while (!q_2511532014.isEmpty()) {
			s_2511532014.push(q_2511532014.remove());
		}
		while (!s_2511532014.isEmpty()) {
			q_2511532014.add(s_2511532014.pop());
		}
		System.out.println("Sesudah reverse: "+ q_2511532014);

	}

}
