package day05;

public class School {
	public static void main(String[] args) {
		Student han = new Student(1,"한동석");
		System.out.println(han.equals(new Student(1,"한동석")));
	
		//결과가 true가 나올 수 있게 equals를 재정의
	}
}
