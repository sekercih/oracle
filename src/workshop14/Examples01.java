package workshop14;

public class Examples01 {
	public static void main (String[] args) {
		String [] str=new String[2];
		int idx=0;
		for (String string : str) {
			str [idx].concat("element"+idx);
			idx++;
		}
		for (idx= 0 ; idx < str.length; idx++) {
			System.out.println(str[idx]);
			
		}
		}

}
