package oop.collection;

public class GenericList<세은> {

	private 세은[] objects;
	private int index;
	private int capacity;
	
	public GenericList() {
		// TODO Auto-generated constructor stub
		objects = (세은[]) new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(세은 obj)
	{
		if(index >= capacity)
		{
			세은[] temp = (세은[]) new Object[capacity + 5];//기존 최대 배열갯수에서 5개 추가

			for (int j = 0; j < index; j++) {
				temp[j] = objects[j];
			}
			
			capacity +=5;
			
			objects = temp;
			
		}
								
		objects[index] = obj;

		index++;
	}

	public int get(int i) {
		// TODO Auto-generated method stub
	
		return (int) objects[i];
	}


}
