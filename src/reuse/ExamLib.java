package reuse;

import java.util.Scanner;



public class ExamLib {

	public static void print(Exam exam) {
		// TODO Auto-generated method stub
		int kor = exam.kor;
		int math = exam.kor;
		int eng = exam.kor;
		
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

	public static void input(Exam exam) {
		// TODO Auto-generated method stub
		int kor = exam.kor;
		int math = exam.math;
		int eng = exam.eng;
		
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println(" │                                                                                                    │");
		System.out.println(" │                                           성적 입력                                                                                       					  │");
		System.out.println(" │                                                                                                    │");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────────────────────");
		
		Scanner scan = new Scanner(System.in);

		do
		{
			System.out.printf(" 국어 : ");
			kor = scan.nextInt();
			if(0 > kor || kor > 100)
			System.out.println("유효범위내에 점수를 입력하세요 0~100");
		}
		while (0 > kor || kor > 100);

		
		System.out.printf(" 수학 : ");
		math = scan.nextInt();
		System.out.printf(" 영어 : ");
		eng = scan.nextInt();
		
		
		exam.kor = kor;
		exam.math = math;
		exam.eng = eng;
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
