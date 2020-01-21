package practice;

import java.util.Arrays;

public class SortingArray {
	
	public static void main(String[] args) throws Exception {

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		Arrays.sort(inputList);
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);
		for(String arr : inputList)
		{
			System.out.print(arr+" ");
		}
		System.out.println();

	}

	


}
