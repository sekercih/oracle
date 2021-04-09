package workshop13;

public class Examples01 {
String greet="Welcome";
public Examples01() {
	String greet="Hello";
}
public  void  setGreet() {
	String greet="Good Day";
	System.out.println(greet);
}
	public static void main(String[] args) {
		Examples01 t=new Examples01();
		String greet="Good Luck";
		System.out.println(t.greet);
		t.setGreet();
	}

}
