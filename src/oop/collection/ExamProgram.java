package oop.collection;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExamList list = new ExamList();
//		Exam[] exams = new Exam[3];
//		int index = 0;
//		int capacity = 3;

		int menu;
		while (true) {
			
			menu = Exam.inputMenu();
			
			switch (menu) {
			case 1:

				String yesOrNo = "";
				
				Scanner scan = new Scanner(System.in);
				
				for(int i = 0; i< 3;i++)
				{
					
					do
					{
						Exam exam = new Exam();
						exam.input();
						
						list.add(exam);
				
					}
					while(!yesOrNo.equals("n"));
					
					break;
		
				}
				
				break;
			case 2:
				
				for(int i = 0; i< list.size();i++)
				{
					Exam exam = list.get(i);
					exam.print();
				}
				break;
			case 3:

				break;

			default:
				break;
			}

		}
	}
	void DD()
	{
		
	}

}
