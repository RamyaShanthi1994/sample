package javaExamples;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MADAM";
		String rev = "";
		/*for(int i=str.length()-1;i>=0;i--)
		{
			 rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("NOt a Palindrome");
		}*/
		StringBuffer stf=new StringBuffer(str);
		if(stf.reverse().toString().equals(str))
		{
			System.out.println("palindrome");
		}
		
	}

}
