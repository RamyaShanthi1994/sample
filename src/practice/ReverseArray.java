 package practice;

public class ReverseArray {

	static CallByValue val=new CallByValue();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=30;
		/*int temp=x;
		x=y;
		y=temp;*/
		
		/*x=x+y;
		y=x-y;
		x=x-y;*/
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x +" " + y);
		
		 val = new CallByValue();
	}

}
