package javaExamples;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="RAMYAHAKEEM";
		char[] var = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(var[i]==var[j])
				{
					System.out.println(var[i]);
				}
			}
		}
	}

}
