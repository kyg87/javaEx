package oop.collection;

import java.util.Scanner;

public class Exam {

	private int kor;
	private int math;
	private int eng;
	
	public static void setKor(Exam exam, int kor)
	{
		exam.kor = kor;
	}
	
	public void print() {
		// TODO Auto-generated method stub
		int kor = this.kor;
		int math = this.kor;
		int eng = this.kor;
		
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

	public void input() {
		// TODO Auto-generated method stub
		int kor = this.kor;
		int math = this.math;
		int eng = this.eng;
		
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
		
		
		this.kor = kor;
		this.math = math;
		this.eng = eng;
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
