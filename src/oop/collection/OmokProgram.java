package oop.collection;

public class OmokProgram {

	public static void main(String[] args) {

		Board board = new Board();

		OmokList list = new OmokList();

		while (true) {

			Omok omok = new Omok();
			list.add(omok);

			omok.input();
			board.put(omok);

			board.print();
		}
	}
}
