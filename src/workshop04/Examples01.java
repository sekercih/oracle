package workshop04;

public class Examples01 {
	
	public static void main(String[] args) {
	int x=6;
	while (isA(--x)) {
		System.out.print(x);
	}}
				
public static boolean isA(int x) {
	return --x>0?true:false;

	}

}
