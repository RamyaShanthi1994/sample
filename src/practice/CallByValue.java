package practice;

public class CallByValue {
	
	public static int i;
	
	public static void main(String[] args)
	{
		 i=100;
//		 CallByValue val=new CallByValue();
//		 change(i);
		 int arr[]= {1,2,3,4,5};
		 changeArr(arr);
		 System.out.println(arr[1]);
		 change(i);
		 System.out.println(i);
	}
		
	public static void change(int a)
	{
		a=a+5;
	}
	
	public static void changeArr(int numArr[]) 
	{
		numArr[1]++;
	}

}
