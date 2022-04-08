package code;

import java.util.Random;
import java.util.Scanner;

public class code02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		// 최소치 최대치 변경 x
		int max = 100;
		int min = 0;
		
		//맞춰야될 랜덤 변수
		int rnum ;
		rnum = random.nextInt(max)+1;
		
	
		while(true) {
			
			//입력받는 수
			System.out.println("예상하는 정답을 입력해주세요 : ");
			int num = scanner.nextInt();
			
			if(rnum < num) {
				System.out.println("다운");
			}
			else if(rnum > num) {
				System.out.println("업");
			}
			else if(rnum == num) {
				System.out.println("정답");
				break;
			}
		}
	}
}
