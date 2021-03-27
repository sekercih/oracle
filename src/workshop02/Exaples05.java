package workshop02;

public class Exaples05 {

	public static void main(String[] args) {
		int data[]= {2010,2013,2014,2015,2014};
		int key=2014;
		int count=0;
		for (int i : data) {
			if (i!=key) {
				count++;
				continue;
				// count++;//Unreachable code
			}
		}
System.out.println(count+" Fount");
	}

}
