package day05;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//제네릭 : 이름이 없는
		//타입을 지정하지 않는 기법
		//사용할 때 지정하도록 설계한다.
		//지정할 타입에 제한을 줄 수도 있다.
		ArrayList<Integer> datas= new ArrayList<>();
		datas.add(10);
		datas.add(20);
		datas.add(30);
		System.out.println(datas.size());
		System.out.println(datas);
	}
}
