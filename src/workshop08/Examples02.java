package workshop08;

public class Examples02 {
	public static void main(String[] args) {
		String x="aaa-bbb-ccc";
		String credi="1234-5678-1264-7859";
		StringBuilder sb=new StringBuilder(x);
		sb.append(credi,10,12);
		System.out.println(sb);
		System.out.println(sb.toString());
	}

}
