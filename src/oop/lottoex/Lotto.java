package oop.lottoex;

import java.util.Random;

public class Lotto {

	private int[] lottoArray;
	
	
	public Lotto()
	{
		lottoArray = new int[6];
	}
	
	public void gen() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			this.lottoArray[i] = rand.nextInt(6) + 1;
		}
	}
	
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < lottoArray.length; i++) {
			System.out.printf(" %d", lottoArray[i]);
		}
	}
	
	public void sort() {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < i; j++) {
				if (lottoArray[i] ==lottoArray[j]) {
					System.out.printf("ม฿บน  %d %d \n" ,i ,lottoArray[i]);
					
					while(true)
					{
						lottoArray[i] = rand.nextInt(6) + 1;
						
						if (lottoArray[i] != lottoArray[j])
						{
							i--;
							break;
						}
					}
				}
			}
		}
	}
}
