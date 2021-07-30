package anonymous;

public class Starbucks {
	//스타벅스는 등록필요함
	//register메소드에는 매개변수로 메뉴판과 판매방식을
	//받아와야 하기 때문에 타입이 Form이어야 한다. 
	public void register(Form form) {
		String[] arMenu = form.getMenu();
		System.out.println("--------메뉴판---------");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println((i+1+"."+arMenu[i]));
		}
		if (form instanceof FormAdapter) {
			System.out.println("무료나눔중....");
		}else {
			form.sell("아메리카노");
		}
		
	}
	
}

