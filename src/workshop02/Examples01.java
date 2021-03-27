package workshop02;

import java.util.*;

public class Examples01 {
public static void main(String[] args) {
	String arr[] = {"HI","how","are","you"};
	List<String>arrList = new ArrayList<>(Arrays.asList(arr));
	if(arrList.removeIf(s->{System.out.print(s);return s.length()<=2;})) {
		System.out.println("removed");
	}
}

}
