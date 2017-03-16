package struct;

import java.util.Scanner;



public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int menu;
		
		EXAM : while(true)
		{
			menu = inputMenu();
			
			switch (menu) {
			case 1:
				inputExam(kor,eng,math);
				break;
			case 2:
				printExam(kor,eng,math);
				break;
			case 3:
				break;
			default:
				break EXAM;
			}
		}
	}

	public static void printExam(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		int total = kor + math + eng;
		
		float avg = total / 3;
		
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println(" │                                                                                                   │");
		System.out.println(" │                                           메인 메뉴                                                                                       │");
		System.out.println(" │                                                                                                   │");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────────────────────");

		System.out.printf(" 국어 : %d\n", kor);
		System.out.printf(" 수학 : %d\n", math);
		System.out.printf(" 영어 : %d\n", eng);
		System.out.printf(" 총점 : %d\n", total);
		System.out.printf(" 평균 : %f\n", avg);
		
	}

	public static void inputExam(int kor, int eng, int math) {
		// TODO Auto-generated method stub
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println(" │                                                                                                    │");
		System.out.println(" │                                           성적 입력                                                                                       					  │");
		System.out.println(" │                                                                                                    │");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────────────────────");
		
		Scanner scan = new Scanner(System.in);

		System.out.printf(" 국어 : ");
		kor = scan.nextInt();

		do
		{
			System.out.printf(" 국어 : ");
			kor = scan.nextInt();
			if(kor > 100 || kor < 0)
			System.out.println("유효범위내에 점수를 입력하세요 0~100");
		}
		while (kor > 100 || kor < 0);

		
		System.out.printf(" 수학 : ");
		math = scan.nextInt();
		System.out.printf(" 영어 : ");
		eng = scan.nextInt();
	}

	public static int inputMenu() {
		// TODO Auto-generated method stub
		int menu =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println(" │                                                                                                    │");
		System.out.println(" │                                           성적 출력                                                                                       					  │");
		System.out.println(" │                                                                                                    │");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────────────────────");

		System.out.printf("1.성적 입력 \n");
		System.out.printf("2.성적 출력 \n");
		System.out.printf("3.종료 \n");
		System.out.print("선택 > :");
		
		menu = scan.nextInt();
		
		return menu;
	}
	
	 

}
