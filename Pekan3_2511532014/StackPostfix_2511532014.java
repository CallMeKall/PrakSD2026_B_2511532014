package Pekan3_2511532014;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511532014 {
	public static int postfixEvaluate_2511532014(String expression) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while (input.hasNext()) {
			if (input.hasNextInt()) {		// an operand (integer)
				s.push(input.nextInt());
			} else {						//an operator
				String operator = input.next();
				int operand2= s.pop();
				int operand1= s.pop();
				if (operator.equals("+")) {
					s.push(operand1 + operand2);
				} else if (operator.equals("-")) {
					s.push(operand1 - operand2);
				} else if (operator.equals("*")) {
					s.push(operand1 * operand2);
				} else {
					s.push(operand1/operand2);
				}
			}
			
		}
		input.close();
		return s.pop();
	}
	
	public static void main(String[] args) {
		System.out.println("Hasil postfix= " + postfixEvaluate_2511532014("5 2 4 * + 7 -"));

	}

}
