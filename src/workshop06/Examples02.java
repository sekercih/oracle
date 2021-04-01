package workshop06;

class Examples02 {
int x;
Examples02(){
	this(10);
}
Examples02(int x){
	this.x=x;
}
}
class Car extends Examples02{
	int y;
	Car(){
		super();
		//this(20);
		
	}
	Car(int y){
		this.y=y;
	}
	public String toString() {
		return super.x+":"+this.y;
	}
	public static void main(String[] args) {
		Examples02 y=new Examples02();
		System.out.println(y);
	}
}
