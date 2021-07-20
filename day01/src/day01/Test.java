package day01;

public class Test {
	public static void main(String[] args) {
		String data1="2";
		String data2="2";
		System.out.println(data1.intern()==data2);
		System.out.println(data1==data2);
		
	}

}
