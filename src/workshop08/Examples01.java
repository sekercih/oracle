package workshop08;

public class Examples01 {

	public static void main(String[] args) {
		int x=100;
		
		int a=x++;
		System.out.println("a ="+a);
		int b=++x;
		System.out.println("b ="+b);
		int c=x++;
		
		System.out.println("c ="+c);
		int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
		System.out.println("x ="+x);
		int z=a<b?a:x;
		System.out.println("d ="+d);
		System.out.println(z);

	}

}
