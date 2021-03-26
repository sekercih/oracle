package workshop01;

public class Examples03 {
	public static void doSum(Integer x, Integer y) {
		System.out.println("ýnteger " + (x+y));
	}
/*
	public static void doSum(double x, double y) {
		System.out.println("double " + (x+y));
	}*/

	public static void doSum(double x, float y) {
		System.out.println("float " + (x+y));
	}

	public static void doSum(int x, int y) {
		System.out.println("int " + (x+y));
	}

	public static void main(String[] args) {
		doSum(10, 20);
		doSum(10.0f, 20.0f);

	}

}
