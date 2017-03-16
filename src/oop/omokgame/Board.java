package oop.omokgame;

public class Board {

	private char[][] buf;
	
	public Board() {
		// TODO Auto-generated constructor stub
		buf = new char[15][20];
		
		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				buf[y][x] = '¦¶';
			}
		}
	}
	
	public void print() {
		// TODO Auto-generated method stub
		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", buf[y][x]);
			}
			System.out.println();

		}
	}

	public void put(Omok omok) {
		// TODO Auto-generated method stub
		int x = omok.getX();
		int y = omok.getY();
		
		buf[y][x] = '¡Ü';
	}



}
