package workshop07;
class Book{int pages;}
public class Examples03 {
int count;
public void method(Book x,int k) {
	x.pages=100;
	k=200;
}
	public static void main(String[] args) {
		Examples03 obj=new Examples03();
		Book objBook=new Book();
		System.out.println(objBook.pages+" : "+obj.count);
		obj.method(objBook, obj.count);
		System.out.println(objBook.pages+":" +obj.count);

	}

}
