package workshop09;

public class Examples05 {
	int x, y;
	public Examples05(int x, int y) {
		initlalize (x, y );
	
	}
	public void initlalize(int x, int y) { 
		this.x = x * x; 
		this.y = y * y;
	}
	
	public static void main(String[] args) { 
		int x = 9, y = 5;
	Examples05 obi = new Examples05(x, y);
	System.out.println(x + " " + y);
	System.out.println(obi.x+":"+obi.y);
	}}
