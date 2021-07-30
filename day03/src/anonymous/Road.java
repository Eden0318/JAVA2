package anonymous;

public class Road {
	public static void main(String[] args) {
		//잠실점은 무료나눔 행상중....
		//sell 메소드를 구현할 필요없음 -> 어댑터필요
		//무료나눔 행사인 매장은 주문완료대신 "무료나눔중!"출력
		Starbucks jamsil = new Starbucks();
		
		//업캐스팅
		jamsil.register(new FormAdapter() {
		
			@Override
			public String[] getMenu() {
				String []arMenu= {"아메리카노","딸기쥬스","에스프레소"};
				return arMenu;
			}
		
		
		});
		
		Starbucks gangnam = new Starbucks();
		//밑에 register 사용임
		//이 상태에서 바로 실행하면 본사에서 테스트됨
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String []arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(order)) {
						System.out.println(order+"주문완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String []arMenu= {"아메리카노","카페라떼","에스프레소"};
				return arMenu;
			}
		});
		
	}
}

