package inter;

public class Cat implements Animal{

	@Override
	public void eat() {
		System.out.println("참치를 먹는다");
		
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잘잔다");
		
	}

	@Override
	public void getHand() {
		System.out.println("손을 흔들지 않는다");
		
	}

	@Override
	public void shakeTail() {
		System.out.println("꼬리를 흔들지 않는다");
		
	}
	
}
