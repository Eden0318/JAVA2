package day05;

public class Student {
	int num;
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int num, String name) {
		super();
		this.num=num;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		
		if(obj instanceof Student) {
			//다운캐스팅
			Student std = (Student)obj; 
			if(this.num == std.num) {
				return true;
			}
		}
		return false;
	}
}
