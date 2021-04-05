package workshop09;

public class Examples02 {
	public static void main(String[] args) {
		
	

	String stuff = "TV" ;
	String res = null;
	if (stuff.equals("TV"))	{
	res="Walter71";
	}else if (stuff.equals ("Movie" ) ) {
	res = "WhiteT";
	} else {
	res="No Result";
	
	String a=stuff.equals ("TV")	? res= "Walter" : stuff.equals ("Movie") ? res = "White" : "No Result";
	
	res = stuff.equals ("TV")? "Walter" : stuff.equals ("Movie")? "White" : "No Result";
	
	res = stuff.equals ("TV") ? stuff.equals ("Movie")? "Walter" : "White" : "No Result";
	

}}}
