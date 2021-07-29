package day05;

public class Wrapper {
	public static void main(String[] args) {
		int data_i=10;
	
		
		//boxing
		//Integer data_I = new Integer(data_i);
	
		//unboxing
		//data_i = data_I.intValue();
		
		//위에꺼가 너무 불편하다 -> auto 지원
		//auto boxing
		Integer data_I = data_i;
		//auto unboxing
		data_i = data_I;
	
	
	}
}
