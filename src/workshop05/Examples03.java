package workshop05;

public class Examples03 {
	public static void main(String[] args) {
		int prace=1000;
		int qty=2;
		String grade="2";
		double discount=0.0;
		switch (grade) {
		case "1":
			discount=prace*0.1;
			break;
		case "2":
			discount=prace*0.5;
			///continue:
		default:
			System.out.println("Thank you");
		}
		System.out.println(discount);
	}

}
