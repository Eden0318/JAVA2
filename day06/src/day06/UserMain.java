package day06;

public class UserMain {
	public static void main(String[] args){
		UserField uf = new UserField();
		User newUser = new User();

		User checkUser = uf.checkId("hds1234");
		
		if(checkUser == null){
			System.out.println("��� ������ ���̵�");
			newUser.setId("hds1234");
			newUser.setPw("1234");
			uf.join(newUser);
			System.out.println("ȸ������ ����!");
		}else{
			System.out.println("�ߺ��� ���̵�");
		}		

		checkUser = uf.checkId("hds1234");
		
		if(checkUser == null){
			System.out.println("��� ������ ���̵�");
		}else{
			System.out.println("�ߺ��� ���̵�");
		}
	}
}

