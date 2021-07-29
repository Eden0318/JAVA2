package anonymous;

public class Road {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(order)) {
						System.out.println(order + " 주문 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"아메리카노", "카페라떼", "에스프레소"};
				return arMenu;
			}
		});
	}
}

