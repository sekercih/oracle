package workshop10;

public class Examples04 {
	 static int ans;
	public static void main(String[] args) {
		
		 
		String a;
		try {
			int num=10;
			int div=0;
			ans=num/div;
		} catch (ArithmeticException e) {
			ans=3;

	}catch (Exception e) {
		System.out.println("ýnvalýd");
		ans=2;
	}
        System.out.println(ans);
       // System.out.println(a);
}}
