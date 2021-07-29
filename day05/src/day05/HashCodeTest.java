package day05;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		String data1 ="ABC";
		String data2=new String("ABC");
		
		Random r1 =new Random();
		Random r2 =new Random();
		
		//hashcode는 자바에서 주소값을 의미
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
	
		
		
	}
}
