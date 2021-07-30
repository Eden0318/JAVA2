package day06;

public class UserMain {
	public static void main(String[] args){
		UserField uf = new UserField();
		User newUser = new User();

		User checkUser = uf.checkId("hds1234");
		
		if(checkUser == null){
			System.out.println("사용 가능한 아이디");
			newUser.setId("hds1234");
			newUser.setPw("1234");
			uf.join(newUser);
			System.out.println("회원가입 성공!");
		}else{
			System.out.println("중복된 아이디");
		}		

		checkUser = uf.checkId("hds1234");
		
		if(checkUser == null){
			System.out.println("사용 가능한 아이디");
		}else{
			System.out.println("중복된 아이디");
		}
	}
}

