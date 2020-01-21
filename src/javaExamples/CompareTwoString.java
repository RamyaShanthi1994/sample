package javaExamples;

public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="HAKEEMRAMYA";
		String s2="HAKEEM";
		
		if(s1.equals(s2))
		{
			System.out.println("String are equal");
		}
		else if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("String are equal but case is different");
		}
		else {
			System.out.println("String are not equal");
		}
	}

}
