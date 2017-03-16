package oop;

import java.io.IOException;
import java.util.Random;

public class TTT0206 {
	public static void main(String[] args) throws IOException {
		
		
	
		//card »ý¼º
		int[] cards = createCards();
		
		//card ¼ÅÇÃ
		suffleCards(cards);
		
		printCards(cards);
		
		
	}
	
	
	public static int setValue()
	{
		return 6;
	}
	
	public static void TT(int x)
	{
		x = x * x;
	}
	
	
	public static int[] createCards()
	{
		int[] cards = new int[52];

		for (int i = 0; i < cards.length; i++) {
			cards[i] = i + 1;
		
			  
		}	
		return cards;
	}
	
	public static void suffleCards(int[] cards){
		
		Random rand = new Random();
		int temp;
		
		
		for (int i = 0; i < 100; i++) {
			int left = rand.nextInt(52);
			int right = rand.nextInt(52);

			temp = cards[left];

			cards[left] = cards[right];
			cards[right] = temp;
		}
			
	}
	public static void printCards(int[] cards){
		
		
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%3d", cards[i]);

		}

		
	}
	
}
