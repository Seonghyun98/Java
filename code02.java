package code;

import java.util.Random;
import java.util.Scanner;

public class code02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// �ּ�ġ �ִ�ġ ���� x
		int max = 100;
		int min = 0;
		
		//����ߵ� ���� ����
		int rnum ;
		rnum = random.nextInt(max)+1;
		
	
		while(true) {
			
			//�Է¹޴� ��
			System.out.println("�����ϴ� ������ �Է����ּ��� : ");
			int num = scanner.nextInt();
			
			if(rnum < num) {
				System.out.println("�ٿ�");
			}
			else if(rnum > num) {
				System.out.println("��");
			}
			else if(rnum == num) {
				System.out.println("����");
				break;
			}
		}
	}
}
