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
						System.out.println(order + " �ֹ� �Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] arMenu = {"�Ƹ޸�ī��", "ī���", "����������"};
				return arMenu;
			}
		});
	}
}

