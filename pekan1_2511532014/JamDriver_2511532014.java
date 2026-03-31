package pekan1_2511532014;

public class JamDriver_2511532014 {

	public static void main(String[] args) {
		Jam_2511532014 a = new Jam_2511532014(23,59,50);
		Jam_2511532014 b = new Jam_2511532014(0,0,15);
		System.out.println("a		= "+a);
		System.out.println("b		= "+b);
		System.out.println("a+b		= "+a.plus(b));
		System.out.println("next 20s	= "+a.nextNSecondS(20));
		System.out.println("durasi (a,b)	 = "+ Jam_2511532014.durasiDetik(a, b));
		System.out.println("a.compareT0 (b)	 = "+a.compareTo(b));

	}

}
