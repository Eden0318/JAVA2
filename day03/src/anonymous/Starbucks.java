package anonymous;

public class Starbucks {
	public void register(Form form) {
		String[] arMenu = form.getMenu();
		
		System.out.println("======�޴���======");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println(i + 1 + ". " + arMenu[i]);
		}
		
		form.sell("�Ƹ޸�ī��");
	}
}

