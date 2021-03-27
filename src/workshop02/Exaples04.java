package workshop02;

public class Exaples04 {
public static void main(String[] args) {
	/*int a=1;
	double b=1.0;
	System.out.println(a==b);*/
	String []arr= {"A","B","C","D"};
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		if (arr[i].equals("C")) {
			//continue;
		}
		System.out.println("Work Done");
		break;
	}
	
	
	
}
}
