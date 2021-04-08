package workshop12;

public class Examples02 {
	
	void  readCard(int cardNo) throws Exception {
		System.out.println("reading cart");
	}

	void checkCard(int cardNo) throws RuntimeException {
		System.out.println("chesckcart");
	}

	public static void main(String[] args) {
		Examples02 ex = new Examples02();
		int cardNo = 12345;
		//ex.readCard(cardNo);
		ex.checkCard(cardNo);

	}

}
