package oop;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int[] lotto = new int[6];
		
	
		genLotto(lotto);
		
		printLotto(lotto);
		
		sortLotto(lotto);
		
		printLotto(lotto);


	}
	
	public static void genLotto(int[] lotto) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = rand.nextInt(6) + 1;
		}
	}
	
	public static void sortLotto(int[] lotto) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					System.out.printf("ม฿บน  %d %d \n" ,i ,lotto[i]);
					
					while(true)
					{
						lotto[i] = rand.nextInt(6) + 1;
						
						if (lotto[i] != lotto[j])
						{
							i--;
							break;
						}
					}
				}
			}
		}
	}

	public static void printLotto(int[] lotto) {
		// TODO Auto-generated method stub
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf(" %d", lotto[i]);
		}
	}



}
