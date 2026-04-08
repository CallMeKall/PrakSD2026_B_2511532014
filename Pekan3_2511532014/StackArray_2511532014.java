package Pekan3_2511532014;

public class StackArray_2511532014 {
	static final int MAX_2511532014 = 1000;
	int top;
	int a[] = new int[MAX_2511532014];
	boolean isEmpty_2511532014() {
		return (top < 0);
	}
	StackArray_2511532014(){
		top = -1;
	}
	boolean push_2511532014(int x) {
		if (top >= (MAX_2511532014 - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " dimasukan dalam stack");
			return true;
		}
	}
	int pop_2511532014() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top--];
			return x;
		}
	}
	int peek_2511532014() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}
	void print_2511532014() {
		for (int i = top; i>-1; i--) {
			System.out.print(" "+ a[i]);
		}
	}
}
