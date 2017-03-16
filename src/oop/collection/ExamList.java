package oop.collection;

public class ExamList {
	private Exam[] exams;
	private int index;
	private int capacity;
	
	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}
	
	public void add(Exam exam)
	{
		if(index >= capacity)
		{
			Exam[] temp = new Exam[capacity + 5];//기존 최대 배열갯수에서 5개 추가

			for (int j = 0; j < index; j++) {
				temp[j] = exams[j];
			}
			
			capacity +=5;
			
			exams = temp;
			
		}
								
		exams[index] = exam;

		index++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}



}
