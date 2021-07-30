package anonymous;

public interface Form {
	//폼에는 메뉴판메소드와 판매방식메소드 2가지
	//지점별로 인터페이스 받아 구현한다
	//메뉴판
	public String[] getMenu();
	//판매방식
	public void sell(String order);
}
