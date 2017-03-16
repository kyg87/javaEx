package oop.inter.ui;

import java.util.Scanner;

import oop.inter.entity.Exam;


public class ExamConsole {

	
	
	private Exam exam;
	
	
	private PrintListener printListener;
	
	
	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}


	public ExamConsole(Exam exam) {
		// TODO Auto-generated constructor stub
		 this.exam = exam;
	}

	
	public Exam getExam() {
		return exam;
	}


	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public void print() {
		// TODO Auto-generated method stub
		int kor = exam.getKor();
		int math = exam.getMath();
		int eng = exam.getEng();
		
		int total = exam.total();
		
		float avg = exam.avg();
		
		System.out.println(" ┌────────────────────────────────────────────────────────────────────────────────────────────────────");
		System.out.println(" │                                                                                                    │");
		System.out.println(" │                                           성적 출력                                                                                       					  │");
		System.out.println(" │                                                                                                    │");
		System.out.println(" └────────────────────────────────────────────────────────────────────────────────────────────────────");
		

		
		
		System.out.printf(" 국어 : %d\n", kor);
		System.out.printf(" 수학 : %d\n", math);
		System.out.printf(" 영어 : %d\n", eng);
		if(printListener != null)
			printListener.onPrint(exam);
		System.out.printf(" 총점 : %d\n", total);
		System.out.printf(" 평균 : %f\n", avg);
		
	}


	
	public void input() {
		// TODO Auto-generated method stub
		int kor;
		int math ;
		int eng ;
		
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
		
		exam.setEng(eng);
		exam.setKor(kor);
		exam.setMath(math);

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
