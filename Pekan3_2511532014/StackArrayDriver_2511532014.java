package Pekan3_2511532014;

public class StackArrayDriver_2511532014 {
	public static void main(String[] args) {
		StackArray_2511532014 s = new StackArray_2511532014();
		s.push_2511532014(10);
		s.push_2511532014(20);
		s.push_2511532014(30);
		System.out.println(s.pop_2511532014() + " dikeluarkan dari stack");
		System.out.println("Element teratas adalah: "+ s.peek_2511532014());
		System.out.println("Element pada stack: ");
		s.print_2511532014();
	}
}
