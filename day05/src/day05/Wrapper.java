package day05;

public class Wrapper {
	public static void main(String[] args) {
		int data_i=10;
	
		
		//boxing
		//Integer data_I = new Integer(data_i);
	
		//unboxing
		//data_i = data_I.intValue();
		
		//�������� �ʹ� �����ϴ� -> auto ����
		//auto boxing
		Integer data_I = data_i;
		//auto unboxing
		data_i = data_I;
	
	
	}
}
