package anonymous;

public class Road {
	public static void main(String[] args) {
		//������� ���ᳪ�� �����....
		//sell �޼ҵ带 ������ �ʿ���� -> ������ʿ�
		//���ᳪ�� ����� ������ �ֹ��Ϸ��� "���ᳪ����!"���
		Starbucks jamsil = new Starbucks();
		
		//��ĳ����
		jamsil.register(new FormAdapter() {
		
			@Override
			public String[] getMenu() {
				String []arMenu= {"�Ƹ޸�ī��","�����꽺","����������"};
				return arMenu;
			}
		
		
		});
		
		Starbucks gangnam = new Starbucks();
		//�ؿ� register �����
		//�� ���¿��� �ٷ� �����ϸ� ���翡�� �׽�Ʈ��
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String []arMenu = getMenu();
				for (int i = 0; i < arMenu.length; i++) {
					if(arMenu[i].equals(order)) {
						System.out.println(order+"�ֹ��Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String []arMenu= {"�Ƹ޸�ī��","ī���","����������"};
				return arMenu;
			}
		});
		
	}
}

