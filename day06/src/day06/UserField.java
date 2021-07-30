package day06;

import java.util.ArrayList;

public class UserField {
	//DB
	ArrayList<User> users =new ArrayList();
	
	//아이디 중복검사
	public User checkId(String id) {
		User user = null;
		for(int i=0; i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				user=users.get(i);
			}
		}
		return user;
	}
	//회원가입
	public void join(User user) {
		users.add(user);
	}
	//로그인
	public boolean login(String id, String pw) {
		User user = checkId(id);//중복검사
		if(user != null) {
			if(user.getPw().equals(encrypt(pw))) {
				return true;
			}
		}
		return false;
	}
	//암호화
	public String encrypt(String pw) {
		String en_pw="";
		
		for(int i=0; i<pw.length();i++) {
			en_pw+=(char)(pw.charAt(i)*3);
		}
		return en_pw;
	}
}