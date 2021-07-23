package exception;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
		//try ~ catch 사용하기
		//무한 반복안에서 5개의 정수만 입력받고 5칸 배열에 넣기
		//q로 나가기
		Scanner sc = new Scanner(System.in);
		int[] arData = new int[5];
		int index = 0;
		String temp = null;
		
		while(true) {
			System.out.print(++index + "번째 정수 입력[q : 나가기] : ");
			try {
				temp = sc.next();
				if(temp.equals("q")) {break;}
				
				arData[index - 1] = Integer.parseInt(temp);
				System.out.println("추가 성공");
			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요.");
				index--;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("더 이상 정수를 입력할 수 없습니다.");
				index--;
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

