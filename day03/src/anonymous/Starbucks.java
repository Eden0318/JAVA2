package anonymous;

public class Starbucks {
	//��Ÿ������ ����ʿ���
	//register�޼ҵ忡�� �Ű������� �޴��ǰ� �ǸŹ����
	//�޾ƿ;� �ϱ� ������ Ÿ���� Form�̾�� �Ѵ�. 
	public void register(Form form) {
		String[] arMenu = form.getMenu();
		System.out.println("--------�޴���---------");
		for (int i = 0; i < arMenu.length; i++) {
			System.out.println((i+1+"."+arMenu[i]));
		}
		if (form instanceof FormAdapter) {
			System.out.println("���ᳪ����....");
		}else {
			form.sell("�Ƹ޸�ī��");
		}
		
	}
	
}

