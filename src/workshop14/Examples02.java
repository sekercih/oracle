package workshop14;

public class Examples02 {
void readCard(int cardNo) throws Exception{
	System.out.println("reading");
}
void checkCard(int cardNo )throws RuntimeException{
	System.out.println("checking");
}
	public static void main(String[] args) throws Exception {
		Examples02 ex=new Examples02();
		int cardNo=1234;
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
		
	}

}
