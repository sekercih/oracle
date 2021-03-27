package workshop02;

public class Exaples03 {
 String name;
 boolean contract;
 double salary;
 Exaples03(){
	 ///
	 this.name=new String("Joe");
	 this.contract=true;
	 this.salary=100.0;
	 
 }
 public String toString() {
	 return name+ " :"+contract+ " :"+salary;
 }
	public static void main(String[] args) {
		Exaples03 e=new Exaples03();
		
		System.out.println(e);

	}

}
