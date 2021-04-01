package workshop05;

public class Examples07 {
	String myStr="9009";
	public void doSu(String str) {
		int myNum=0;
		try {
			String myStr=str;
			myNum=Integer.parseInt(myStr);
		} catch (NumberFormatException e) {
			System.err.println("Error");
			
		}
		System.out.println("mystr ="+myStr+" MyNum= "+myNum);
	}
	public static void main(String[] args) {
		Examples07 obj =new Examples07();
		obj.doSu("7007");
	}

}
