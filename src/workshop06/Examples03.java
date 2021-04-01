package workshop06;

public class Examples03 {
	public static void main(String[] args) {
		String []strs=new String[2];
		int idx=0;
		for (String s : strs) {
			strs[idx].concat("element"+idx);
			idx++;
		}
		for (int i = 0; idx< strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
	

}
