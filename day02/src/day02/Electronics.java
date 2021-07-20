package day02;

public abstract class Electronics {
	
	public abstract void on();
	public abstract void off();
	public final void printManual() {
		System.out.println("전자제품");
	}

}
