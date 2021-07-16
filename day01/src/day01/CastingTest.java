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
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	
	void engineStop(){
		System.out.println("¿­¼è·Î ½Ãµ¿ ²û");
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
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿Å´");
		
	} 
	
	void openRoof() {
		System.out.println("¶Ñ²± ¿­¸²");
	}
	
	void closeRoof() {
		System.out.println("¶Ñ²± ´ÝÈû");
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
