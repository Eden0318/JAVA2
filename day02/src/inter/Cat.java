package inter;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("��ġ�� �Դ´�");
		
	}

	@Override
	public void sleep() {
		System.out.println("���� ���ܴ�");
		
	}

	@Override
	public void getHand() {
		System.out.println("���� ����� �ʴ´�");
		
	}

	@Override
	public void shakeTail() {
		System.out.println("������ ����� �ʴ´�");
		
	}
	
}
