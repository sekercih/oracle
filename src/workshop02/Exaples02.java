package workshop02;

import java.util.Arrays;

public class Exaples02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3};
		int arr2[]=new int[5];
		System.out.println(Arrays.toString(arr2));
		arr2=arr1;
		System.out.println(Arrays.toString(arr2));
		for (int i : arr2) {
			System.out.print(i+" ");
			
		}

	}

}
