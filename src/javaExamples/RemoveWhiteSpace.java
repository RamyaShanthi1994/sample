package javaExamples;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a    Rmaya     g";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("\\s", ""));
	}

}
