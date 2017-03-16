package oop;
import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///오목판 생성
		char[][]board = createBoard();
		
		//오목판 그리기
		drawBoard(board);
		
		//오목판 출력
		printBoard(board);
		
		
	}

	public static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				System.out.printf("%c", board[y][x]);
			}

			System.out.println();
		}
	}

	public static void drawBoard(char[][] board) {
		// TODO Auto-generated method stub
		
		for (int y = 0; y < 15; y++) {

			for (int x = 0; x < 20; x++) {
				board[y][x] = '╋';
			}
		}
		
	}

	public static char[][] createBoard() {
		
		char[][] board = new char[15][20];
		
		return board;
	}

}
