package workshop07;

import java.util.*;

public class Examples02 {

	public static void main(String[] args) {
		ArrayList myList=new ArrayList();
		String[]myArray;
		boolean sa=true;
		try {
			while (myList.size()!=9) {
				myList.add("My String");
			}
		} catch (RuntimeException e) {
			System.out.println("Caught RuntimeException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println("Ready");
		System.out.println(myList);

	}

}
