package exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		//try ~ catch ����ϱ�
		//���� �ݺ��ȿ��� 5���� ������ �Է¹ް� 5ĭ �迭�� �ֱ�
		//q�� ������
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		int index = 0;
		String temp = null;
		
		while(true) {
			System.out.print(++index + "��° ���� �Է�[q : ������] : ");
			try {
				temp = sc.next();
				if(temp.equals("q")) {break;}
				
				arData[index - 1] = Integer.parseInt(temp);
				System.out.println("�߰� ����");
			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���.");
				index--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�� �̻� ������ �Է��� �� �����ϴ�.");
				index--;
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

