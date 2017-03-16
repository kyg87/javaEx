package oop.array;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index = 0;
		int capacity = 3;
		
		Exam[] exams = new Exam[3];
	
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
						if(index >= capacity)
						{
							Exam[] temp = new Exam[index + 5];//기존 최대 배열갯수에서 5개 추가
				
							for (int j = 0; j < index; j++) {
								temp[j] = exams[j];
							}
							
							capacity +=5;
							
							exams = temp;
							
						}
												
						exams[index] = new Exam();
						exams[index].input();
						
						System.out.print("계속 할꺼니? y Or n \n");
						yesOrNo = scan.nextLine();
						
						index++;
					}
					while(!yesOrNo.equals("n"));
					
					break;
		
				}
				
				break;
			case 2:
				
				for(int i = 0; i< index;i++)
				{
					exams[i].print();
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
