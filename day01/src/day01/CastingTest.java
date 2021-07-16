package day01;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {
		
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop(){
		System.out.println("����� �õ� ��");
	}

}

class SuperCar extends Car{
	
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ�Ŵ");
		
	} 
	
	void openRoof() {
		System.out.println("�Ѳ� ����");
	}
	
	void closeRoof() {
		System.out.println("�Ѳ� ����");
	}
	
}

public class CastingTest {
	public static void main(String[] args) {
	//up casting
	Car noOptionFerrari = new SuperCar();
	noOptionFerrari.engineStart();
	
	SuperCar FullOptionFerrari = (SuperCar)noOptionFerrari;
	FullOptionFerrari.closeRoof();
	
	

	}
}
