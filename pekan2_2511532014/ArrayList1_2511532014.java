package pekan2_2511532014;
import java.util.ArrayList;
public class ArrayList1_2511532014 {
	public static void main(String[] args) {
		int n = 5; // array size
		//declaring array list
		ArrayList<Integer> arrli= new ArrayList<Integer> (n);
		//
		for (int i = 1; i <= n; i++)
			arrli.add(i);
			//printing element
			System.out.println(arrli);
			//remove element at index 3
			arrli.remove(3);
			//displating array list after deletion
			System.out.println(arrli);
			//printing elemenet one by one
			for (int i = 0; i<arrli.size();i++)
				System.out.print(arrli.get(i)+ " ");

	}

}
