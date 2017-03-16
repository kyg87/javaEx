import java.util.Random;

public class CardProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cards = new int[52];

		for (int i = 0; i < cards.length; i++) {
			cards[i] = i + 1;
		}

		int temp = 0;
		Random rand = new Random();

		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%3d", cards[i]);

		}

		for (int i = 0; i < 100; i++) {
			int left = rand.nextInt(52);
			int right = rand.nextInt(52);

			temp = cards[left];

			cards[left] = cards[right];
			cards[right] = temp;
		}
		
		System.out.println();
		
		for (int i = 0; i < cards.length; i++) {
			System.out.printf("%3d", cards[i]);

		}

	}

}
